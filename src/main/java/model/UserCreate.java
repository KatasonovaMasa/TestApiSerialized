
package model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class UserCreate {

    @SerializedName("name")
    private String name;
    @SerializedName("job")
    private String job;



    public String getName() { return name; }
    public UserCreate setName(String name)
    {
        this.name = name;
        return this;
    }
    public String getJob() { return job; }
    public UserCreate setJob (String job)
    {
        this.job = job;
        return this;
    }
}
