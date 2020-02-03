package collections

fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection. groupBy { s -> s.length }

    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size }.max()

    return groupsByLength.values.firstOrNull { group -> maximumSizeOfGroup == group.size }
}

// public Collection<String> doSomethingStrangeWithCollection(
//        Collection<String> collection
//) {
//    Map<Integer, List<String>> groupsByLength = Maps.newHashMap();
//    for (String s : collection) {
//        List<String> strings = groupsByLength.get(s.length());
//        if (strings == null) {
//            strings = Lists.newArrayList();
//            groupsByLength.put(s.length(), strings);
//        }
//        strings.add(s);
//    }
//
//    int maximumSizeOfGroup = 0;
//    for (List<String> group : groupsByLength.values()) {
//        if (group.size() > maximumSizeOfGroup) {
//            maximumSizeOfGroup = group.size();
//        }
//    }
//
//    for (List<String> group : groupsByLength.values()) {
//        if (group.size() == maximumSizeOfGroup) {
//            return group;
//        }
//    }
//    return null;
//}