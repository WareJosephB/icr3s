package util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import domain.TransferLocations;

public class XmlParser {
	public static TransferLocations parse(String fileLocation) {
		try {
			JAXBContext jc = JAXBContext.newInstance("domain");
			Unmarshaller u = jc.createUnmarshaller();
			return (TransferLocations) u.unmarshal(new File(fileLocation));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
}