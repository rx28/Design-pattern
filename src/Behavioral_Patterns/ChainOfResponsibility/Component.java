package Behavioral_Patterns.ChainOfResponsibility;

public abstract class Component implements ComponentWithContextualHelp{
    private String tooltipText;
    protected Container container;

    public String showHelp(){
        if(tooltipText!=null){
           return "help";
        }
        else
            return container.showHelp();
    }
}
