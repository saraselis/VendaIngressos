package deserializer;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Venda;

public class VendaDeserializer implements Deserializer<Venda>{

	@Override
	public Venda deserialize(String topic, byte[] venda) {
		// TODO Auto-generated method stub
		try {
			return new ObjectMapper().readValue(venda, Venda.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
