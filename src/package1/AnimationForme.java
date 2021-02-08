package package1;
import java.awt.Graphics;

public class AnimationForme implements IObjetAnimable{
    
    private IObjectDessinable forme;
    private IFormeAnimable formeAnimable;

    public AnimationForme(IObjectDessinable forme, IFormeAnimable formeAnimable) {
        this.forme = forme;
        this.formeAnimable = formeAnimable;
    }

    @Override
    public void deplacer() {
        this.formeAnimable.deplacer(this.forme);
    }

    @Override
    public void dessiner(Graphics g) {
        this.forme.dessiner(g);
    }

	@Override
	public void placerA(int x, int y) {
		// TODO Auto-generated method stub
		
	}
    
    
    
}
