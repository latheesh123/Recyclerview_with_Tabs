package virupakshi.latheesh.com.week2;

/**
 * Created by latheeshvirupakshi on 3/21/17.
 */

public class Model {

    private String mName;
    private String mPhoneNumber;

    public Model(String name,String phone){
        mName = name;
        mPhoneNumber = phone;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }
}
