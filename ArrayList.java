public class ArrayList <Item> implements List <Item>
{
	int size = 0;
	int max = 10;
	Item[] a;

	//initialize the ArrayList
	public ArrayList()
	{
		a = (Item[]) new Object[10];
	} //ArrayList

	//returns the data at the position
	public Item get(int pos)
	{
		return a[pos];
	} //get

	public Item remove(int pos)
	{
		Item i = a[pos];
		for(int x = pos; x < size - 1; x++)
		{
			a[x] = a[x + 1];
		}
		size--;
		return i;
	} //remove

	//puts an item at the beginning of the arraylist
	public void add(Item i)
	{
		if(a.length == size)
		{
			grow();
		}
		a[size++] = i;

	} //add

	public int size()
	{
		return size;
	} //size

	//grows the array in case there aren't enough spots
	public void grow()
	{
		//creates a temperary arraylist
		Item[] temp = (Item[]) new Object[a.length * 2];
		for(int i = 0; i < a.length; i++)
		{
			temp[i] = a[i];
		} //for
		//copies the temp to a
		a = temp;
	}

	//adds the item to the specific position
	public void add(int pos, Item i)
	{
		if(a.length == size)
		{
			grow();
		} //if

		for(int x = size; x > pos; x--)
		{
			a[x] = a[x - 1];
		} //for

		a[pos] = i;
		size++;

	} //add

} //arraylist








