package org.gluu.adminui.app.domain.ws.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LicenseRequest {
    private String licenseKey;
}
