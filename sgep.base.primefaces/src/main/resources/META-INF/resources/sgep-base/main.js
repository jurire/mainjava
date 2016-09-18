PrimeFaces.locales['tr'] = {
	closeText : 'kapat',
	prevText : 'geri',
	nextText : 'ileri',
	currentText : 'bugün',
	monthNames : [ 'Ocak', 'Şubat', 'Mart', 'Nisan', 'Mayıs', 'Haziran', 'Temmuz', 'Ağustos', 'Eylül', 'Ekim', 'Kasım', 'Aralık' ],
	monthNamesShort : [ 'Oca', 'Şub', 'Mar', 'Nis', 'May', 'Haz', 'Tem', 'Ağu', 'Eyl', 'Eki', 'Kas', 'Ara' ],
	dayNames : [ 'Pazar', 'Pazartesi', 'Salı', 'Çarşamba', 'Perşembe', 'Cuma', 'Cumartesi' ],
	dayNamesShort : [ 'Pz', 'Pt', 'Sa', 'Ça', 'Pe', 'Cu', 'Ct' ],
	dayNamesMin : [ 'Pz', 'Pt', 'Sa', 'Ça', 'Pe', 'Cu', 'Ct' ],
	weekHeader : 'Hf',
	firstDay : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Zaman Seçiniz',
	timeText : 'Zaman',
	hourText : 'Saat',
	minuteText : 'Dakika',
	secondText : 'Saniye',
	ampm : false,
	month : 'Ay',
	week : 'Hafta',
	day : 'Gün',
	allDayText : 'Tüm Gün'
};

function makeid()
{
    var text = "";
    var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    for( var i=0; i < 5; i++ )
        text += possible.charAt(Math.floor(Math.random() * possible.length));

    return text;
}

function menuDolas (div, json, root) {
	var yeniDiv = null;
	if (json) {
		var id = json.id;
		var children = json.children;
		var hasChildren = children && children.length > 0;
		if ('root' === id) {
			div.append('<ul id="root-ul" class="page-sidebar-menu " data-auto-scroll="true" data-slide-speed="200"></ul>');
			yeniDiv = $('#root-ul');
		} else {
			var randomId = makeid();
			if (!hasChildren || root === true) {
				//var liContent = '<span id="' + randomId +  '">' + id + '</span>';
				var icon = json.icon; //icon-folder
				var liContent = '<i class="' + icon + '"></i><span class="title">' + id + '</span>';
				div.append('<li id="' + randomId +  '">' + liContent + '</li>');
				yeniDiv = $('#' + randomId);
				if (hasChildren) {
					randomId = makeid();
					yeniDiv.append('<ul id="' + randomId +  '"></ul>');
					yeniDiv = $('#' + randomId);
				}
			} else { //çocukları var demek
				var liContent = '<span class="title">' + id + '</span>';
				div.append('<ul id="' + randomId +  '">' + liContent + '</ul>');
				yeniDiv = $('#' + randomId);
			}
		}
		var children = json.children;
		if (children && children.length > 0) {
			for (var i = 0; i < children.length; i++) {
				menuDolas(yeniDiv, children[i], 'root' === id);
			}	
		}
	}
} 	