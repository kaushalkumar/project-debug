package pkg1;

import pkg1.SharedResourceHelper;
import org.easymock.EasyMock;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.junit.Test;
import org.powermock.modules.junit4.PowerMockRunner;
import org.junit.runner.RunWith;

import java.io.File;


@PrepareForTest({SharedResourceHelper.class})
@RunWith(PowerMockRunner.class)
public class StrategyTest {
	@Test
	@PrepareForTest({SharedResourceHelper.class})
	public void testGetFileResource() throws Exception {
		PowerMock.mockStatic(SharedResourceHelper.class);
		EasyMock.expect(SharedResourceHelper.getFileResource(EasyMock.anyString(), EasyMock.anyObject())).andReturn(File.createTempFile("tmp", "s"));
		// EasyMock.expect(SharedResourceHelper.getFileResource("test", null)).andReturn(File.createTempFile("tmp", "s"));
	}
}
