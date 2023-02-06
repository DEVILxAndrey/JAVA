class Door extends MapSite
{
	Room rooml = null;
	Room room2 = null;
	bool isOpen;

	public Door(Room rooml, Room room2)

	{
	this.rooml = rooml;
	this.room2 = room2;
	}

	public void Enter ()
	{
	System.out.printin ("Door");
	}

	public Room OtherSideFrom(Room room)
	{
	if (room == rooml)
	return room2;
	else
	return room1;
	}
}