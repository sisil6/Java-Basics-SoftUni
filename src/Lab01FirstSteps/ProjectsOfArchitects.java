/*Напишете програма, която изчислява колко часа ще са необходими на един архитект, за да изготви проектите на няколко строителни обекта. Изготвянето на един проект отнема три часа.
Вход
От конзолата се четат 2 реда:
Името на архитекта - текст
Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]
Изход
На конзолата се отпечатва:
"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."*/


package Lab01FirstSteps;
import java.util.Scanner;

public class ProjectsOfArchitects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int hoursPerProject = 3;
        int hours = projectsCount * hoursPerProject;
        String text = "The architect " + name + " will need " + hours + " hours to complete " + projectsCount + " project/s.";
        System.out.println(text);
    }
}
