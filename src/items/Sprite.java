package items;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sprite {
    private BufferedImage image;

    public Sprite() {
    	this.image = loadImage("resources/placeholder.jpg");
    }

    //Fixed By Jacob Zollinger
    private static BufferedImage loadImage(String path){
    	try {
    		return ImageIO.read(Sprite.class.getClassLoader().getResource(path));
    		//returns buffered image.
    	} catch (IOException e) {
    		e.printStackTrace();
    		System.exit(1);
    	}
    	return null;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}