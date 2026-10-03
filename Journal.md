# Journal
Phase 1- 
Overriding equals() is important because the two objects have the same ID, so if you look up artifact4, it can find artifact2. It relies on the overridden equals() instead of Java's default reference equality. With swap with last, you only have to move the last item into the spot of the item you're removing. If you shift everything, you would have to move all the items after it. Since this is an unordered collection, we don't care about keeping the original order, so swapping with the last item makes the removal quicker because you don't have to move multiple items.

