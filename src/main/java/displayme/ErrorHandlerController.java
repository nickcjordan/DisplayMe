package displayme;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
@RequestMapping("/error")
public class ErrorHandlerController implements ErrorController {

	private final ErrorAttributes errorAttributes;

	@Autowired
	public ErrorHandlerController(ErrorAttributes errorAttributes) {
		Assert.notNull(errorAttributes, "ErrorAttributes must not be null");
		this.errorAttributes = errorAttributes;
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

	@RequestMapping
	public Map<String, Object> error(HttpServletRequest aRequest){
		Map<String, Object> body = getErrorAttributes(aRequest,getTraceParameter(aRequest));
		String trace = (String) body.get("trace");
		if(trace != null){
			body.put("trace", trace.split("\n\t"));
		}
		return body;
	}

	private boolean getTraceParameter(HttpServletRequest request) {
		if (request.getParameter("trace") == null) {
			return false;
		}
		return !"false".equals(request.getParameter("trace").toLowerCase());
	}

	private Map<String, Object> getErrorAttributes(HttpServletRequest aRequest, boolean includeStackTrace) {
		return errorAttributes.getErrorAttributes(new ServletRequestAttributes(aRequest), includeStackTrace);
	}

}
