package Part8.HashMap.AReferenceTypeVariable;

import java.util.HashMap;

class Manga {

    private String name;
    private String summary;
    private int published;

    public Manga(String name, int published, String summary)
    {
        this.name = name;
        this.published = published;
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String content) {
        this.summary = content;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " (" + getPublished() + ") \n"
                + "Summary: " + getSummary();
    }
}

class Main
{
    public static void main(String[] args)
    {
        HashMap<String, Manga> directory = new HashMap<>();
        Manga natsumeYuuchinjou = new Manga("Natsume Yuuchinjou", 2005,
                "Natsume Takashi has the ability to see spirits, which he has long kept secret. \n" +
                        "However, once he inherits a strange book that belonged to his deceased grandmother, \n" +
                        "Reiko, he discovers the reason why spirits surround him.");

        directory.put(natsumeYuuchinjou.getName(), natsumeYuuchinjou);

        System.out.println(natsumeYuuchinjou);
    }
}
