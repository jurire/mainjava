package gov.sgk.sgep.base.api.utility.exception;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

/**
 * {@link RuntimeException} lar için uygulama bazında kullanılmalıdır
 * 
 * @author o-mssahin
 * @since 28 Eki 2015
 *
 */
public class BaseError extends RuntimeException implements IException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private List<Throwable> causeList;
	private boolean showSummary = true;
	
	public BaseError() {
		super();
	}

	public BaseError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaseError(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseError(String message) {
		super(message);
	}

	public BaseError(Throwable cause) {
		super(cause);
	}

	@Override
	public String description() {
		return getMessage();
	}

	@Override
	public String code() {
		return code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Throwable> getCauseList() {
		return CollectionUtils.isEmpty(causeList) ? new ArrayList<Throwable>() : causeList;
	}

	public void setCauseList(List<Throwable> causeList) {
		this.causeList = causeList;
	}

	@Override
	public List<Throwable> listCause() {
		return getCauseList();
	}

	@Override
	public boolean showSummary() {
		return isShowSummary();
	}

	public boolean isShowSummary() {
		return showSummary;
	}

	public void setShowSummary(boolean showSummary) {
		this.showSummary = showSummary;
	}

}
