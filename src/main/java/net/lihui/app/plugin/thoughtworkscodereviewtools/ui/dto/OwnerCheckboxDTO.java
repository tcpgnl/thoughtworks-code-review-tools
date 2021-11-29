package net.lihui.app.plugin.thoughtworkscodereviewtools.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OwnerCheckboxDTO {
    private String fullName;
    private boolean selected = false;
}
