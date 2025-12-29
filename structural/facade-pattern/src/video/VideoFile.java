package video;

/* this could be record which mean
* any attribute will be final and private
* and ypu only have getter by default */

public class VideoFile {
    private final String name;
    private final String codecType;

    public VideoFile(String name, String codecType) {
        this.name = name;
        this.codecType = codecType;
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
