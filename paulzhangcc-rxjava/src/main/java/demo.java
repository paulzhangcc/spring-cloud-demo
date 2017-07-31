import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by paul on 2017/7/7.
 */
public class demo {
    public static void main(String[] args) {
        //hello("world-one","world-two");
        flatMap();
    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                String format = String.format("Thread[%s],result[%s]", Thread.currentThread().getName(), "Hello " + s + "!");
                System.out.println(format);

            }

        });
    }
    public static void flatMap(){
        Subscriber<? super String> _subscriber = null;
        Observable<String> sender = Observable.create(new Observable.OnSubscribe<String>() {

            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hi，Weavey！");  //发送数据"Hi，Weavey！"
            }
        });

        Observer<String> receiver = new Observer<String>() {

            @Override
            public void onCompleted() {

                //数据接收完成时调用
            }

            @Override
            public void onError(Throwable e) {

                //发生错误调用
            }

            @Override
            public void onNext(String s) {

                //正常接收数据调用
                System.out.print(s);  //将接收到来自sender的问候"Hi，Weavey！"
            }
        };

        sender.subscribe(receiver);
    }
}
