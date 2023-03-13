package be.vdab.oefeningGastenboek;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gastenboek implements Serializable {
    private static final long serialVersionUID = 1L;
    private final List<GastenboekEntry> entries = new ArrayList<>();
    public void toevoegen(GastenboekEntry gastenboekEntry) {
        entries.add(gastenboekEntry);
    }
    @Override
    public String toString() {
        var builder = new StringBuilder();
        for (var index = entries.size() - 1; index >= 0; index --) {
            builder.append(entries.get(index)).append("\n");
        }
        return builder.toString();
    }
}
