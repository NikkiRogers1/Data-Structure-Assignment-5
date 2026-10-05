# Journal
Phase 1- 
Overriding equals() is important because the two objects have the same ID, so if you look up artifact4, it can find artifact2. It relies on the overridden equals() instead of Java's default reference equality. With swap with last, you only have to move the last item into the spot of the item you're removing. If you shift everything, you would have to move all the items after it. Since this is an unordered collection, we don't care about keeping the original order, so swapping with the last item makes the removal quicker because you don't have to move multiple items.

Phase 2- 
The LinkedCollection can add an item in O(1) time because it does not have to go through the whole list to add something. It creates a new node, connects it to the current head, and then makes the new node the head. One downside is that linked lists use more memory because each node has to store the information and a link to the next node. Another downside is cache locality. The nodes are not necessarily stored next to each other in memory, so going through the list can be slower than an array because an array keeps its elements together.

