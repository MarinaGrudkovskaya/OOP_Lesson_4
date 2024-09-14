package OOP.Lessen4;

import java.util.Iterator;
import java.util.List;
//� Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterator (+)
public class Stream implements Iterable<StudyGroup>{
    private List<StudyGroup> studyGroupList;
    private String name;

    public Stream(List<StudyGroup> studyGroupList, String name) {
        this.studyGroupList = studyGroupList;
        this.name = name;
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroupList.iterator();
    }
}
