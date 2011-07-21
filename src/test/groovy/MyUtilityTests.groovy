class MyUtilityTests extends GroovyTestCase {
    
    void testFoo() {
        byte[] result = MyUtility.someBytes
        assertEquals 0, result[0]
    }
}