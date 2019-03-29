
class LinkedList <Item> implements List <Item>
{
	Node <Item> head;
	int size;

	//initialize the head and size
	public LinkedList()
	{
		head = null;
		size = 0;
	} //LinkedList

	//returs the item at the position
	public Item get(int pos)
	{
		Node <Item> a = head;
		for(int x = 0; x < pos; x++)
		{
			a = a.gNext();
		} //for

		return a.gData();

	} //get

	public void add(int pos, Item i)
	{
		//if the linked list is empty, put the item in the first place
		if(pos == 0)
		{
			Node <Item> a = new Node <Item> (i);
			a.sNext(head);
			head = a;
		} //if

		//else shift all the elements after the position
		else
		{
			Node <Item> prev = head;
			for(int x = 0; x < pos - 1; x++)
			{
				prev = prev.gNext();
			} //for
			Node <Item> a = new Node <Item>(i);
			a.sNext(prev.gNext());
			prev.sNext(a);
		} //else

		size++;

	} //add

	//removes the Item at the position and returns the data
	public Item remove(int pos)
	{
		if(pos == 0)
		{
			Node <Item> curr = head;
			head = head.gNext();
			size--;
			return curr.gData();
		} //remove

		else
		{
			Node <Item> prevous = head;
			for(int x = 0; x < pos - 1; x++)
			{
				prevous = prevous.gNext();
			} //for

			Node <Item> curr = prevous.gNext();
			prevous.sNext(curr.gNext());
			size--;
			return curr.gData();

		} //else

	} //remove

	//adds the object Item to the front of the linkedlist
	public void add(Item i)
	{
		//if the linked list is empty, set it as the first item 
		if(head == null)
		{
			head = new Node <Item> (i);
		} //if
		
		//shifts all the values down
		else
		{
			Node <Item> curr = head;
			while(curr.gNext() != null)
			{
				curr = curr.gNext();
			} //while

			curr.sNext(new Node <Item> (i));
		} //else

		size++;

	} //add

	//returns the size of the linkedlist
	public int size()
	{

		return size;

	} //size

	//creates the node and the functions of the nodes
	public class Node <Item>
	{
		Item data;
		Node <Item> next;

		//node
		public Node (Item data)
		{
			this.data = data;
			next = null;
		} //Node

		//returns the data of the node
		public Item gData()
		{
			return this.data;
		} //gData

		//sets the data of the node
		public void sData(Item i)
		{
			this.data = i;
		} //sData

		//gets the next node
		public Node gNext()
		{
			return this.next;
		} //gNext

		//sets the next node
		public void sNext (Node next)
		{
			this.next = next;
		} //sNext

	} //class node

} //class linked list










