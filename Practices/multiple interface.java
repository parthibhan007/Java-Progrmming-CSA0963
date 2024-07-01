class phone
{
    void voicecall()
    {
        System.out.println("Make VoiceClass");
    }
    void sms()
    {
        System.out.println("WEcan Send SMS ");
    }
}

interface camera
{
    void click();
    void record();
}
interface player
{
    void play();
    void pause();
    void stop();
}

class smartphone extends phone implements camera,player
{
    public void click()
    {
        System.out.println("Take The Selfie ");
    }
    public void record()
    {
        System.out.println("Take Video ");
    }

    @Override
    public void play()
    {
        System.out.println("Play the Music  ");
    }

    @Override
    public void pause()
    {
        System.out.println("Pause the Music");
    }

    @Override
    public void stop()
    {
        System.out.println("Stop Music ");
    }
}


//main class
class basic
{
    public static void main(String args[])
    {
        smartphone o = new smartphone();
        o.click();
        o.record();
        o.play();
        o.sms();
        o.pause();
        o.stop();

    }
}