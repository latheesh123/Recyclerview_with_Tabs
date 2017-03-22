package virupakshi.latheesh.com.week2;

/**
 * Created by latheeshvirupakshi on 3/21/17.
 */

public class Model {

    String name;
    String version;
    int id_;
    int image;

    public Model(String name, String version, int id_, int image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image=image;
    }


    public String getName() {
        return name;
    }


    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}
