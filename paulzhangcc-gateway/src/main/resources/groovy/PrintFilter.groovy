import com.netflix.zuul.FilterFileManager
import com.netflix.zuul.ZuulFilter
import com.paulzhangcc.demo.util.SpringContextHelper
import org.slf4j.Logger
import org.slf4j.LoggerFactory


class PrintFilter extends ZuulFilter {
    private static final Logger LOG = LoggerFactory.getLogger(FilterFileManager.class)
    @Override
    String filterType() {
        return "pre"
    }

    @Override
    int filterOrder() {
        return 1
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() {
        def time = new Date().getTime()
        def name = PrintFilter.class.getName()
        LOG.info SpringContextHelper.context.toString()
        LOG.info "$time:$name"
        return null
    }
}
