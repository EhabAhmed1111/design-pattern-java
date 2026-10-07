import javax.sound.midi.MidiDevice;

public abstract class BaseMiddleware  {
private BaseMiddleware next;

    public static BaseMiddleware link(BaseMiddleware firstMiddleware, BaseMiddleware... chainOfMiddleware) {
        BaseMiddleware first =  firstMiddleware;
        for (BaseMiddleware nextMiddleware : chainOfMiddleware) {
            first.next =  nextMiddleware;
            first =  nextMiddleware;

        }
        return first;
    }

    public boolean checkNext(String email, String password)  {
        if(next == null) {
            return true;
        }
        return next.check(email, password);
    }

    public abstract boolean check(String email, String password) ;
}
