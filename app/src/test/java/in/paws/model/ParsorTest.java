package in.paws.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import in.paws.database.DogCategory;
import in.paws.utils.ParsingUtils;

@RunWith(MockitoJUnitRunner.class)
public class ParsorTest {

    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    @Test
    public void testParsing()
    {
        Map<String,List<String>> testData=getTestData();
        List<DogCategory> categories=ParsingUtils.Companion.getDogCategoryList(testData);

        Assert.assertTrue(categories.stream().anyMatch(item -> "Pom".equals(item.getCategory())));
        Assert.assertTrue(categories.get(0).getSubCategory().stream().anyMatch(item -> "Pom1".equals(item)));
        Assert.assertTrue(categories.get(0).getSubCategory().stream().anyMatch(item -> "Pom2".equals(item)));
        Assert.assertTrue(categories.get(0).getSubCategory().stream().anyMatch(item -> "Pom3".equals(item)));
        Assert.assertFalse(categories.get(0).getSubCategory().stream().anyMatch(item -> "Pom4".equals(item)));


    }


    public Map<String,List<String>> getTestData()
    {
        Map<String,List<String>> map= new HashMap<>();

        List<String> categories= new ArrayList<>();
        categories.add("Pom1");
        categories.add("Pom2");
        categories.add("Pom3");
        map.put("Pom",categories);
        return map;

    }




}
