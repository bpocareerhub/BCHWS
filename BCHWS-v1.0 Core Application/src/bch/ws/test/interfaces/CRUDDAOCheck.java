package bch.ws.test.interfaces;

import org.junit.Test;

public interface CRUDDAOCheck {
	@Test
	public void testRetrieveAllNotNull();
	
	@Test
	public void testRetrieveByIdNotNull();
	
	@Test
	public void testRetrieveByIdNull();
	
	@Test
	public void testCreateRecordSuccess();
	
	@Test
	public void testCreateRecordNotSuccess();
	
	@Test
	public void testUpdateRecordSuccess();
	
	@Test
	public void testUpdateRecordNotSuccess();
}
