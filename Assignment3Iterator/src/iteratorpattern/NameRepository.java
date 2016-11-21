package iteratorpattern;

public class NameRepository implements Container{
	
	private String names[] = {"Ashar , Abdullah , Haris , Kamran"};

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	private class NameIterator implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			
			if(index < names.length){
				return true;	
			}
			else 
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return names[index++] ;
			}
			
			return null;
		}
		
	}

}
