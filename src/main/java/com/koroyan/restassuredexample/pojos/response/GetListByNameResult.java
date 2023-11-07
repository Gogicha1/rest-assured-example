package com.koroyan.restassuredexample.pojos.response;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "GetListByNameResult")
@NoArgsConstructor
public class GetListByNameResult {

    private List<PersonIdentification> personIdentifications;

    public GetListByNameResult(List<PersonIdentification> personIdentifications) {
    }

    @XmlElement(name = "PersonIdentification")
    public List<PersonIdentification> getPersonIdentifications() {
        return personIdentifications;
    }

    public void setPersonIdentifications(List<PersonIdentification> personIdentifications) {
        this.personIdentifications = personIdentifications;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);

    }
}
