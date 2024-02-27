package Dataabstraction_using_interface;

//multiple inheritance(one child is trying to acquire properties of 2 different parent )
public   class NobelHosipatal   implements IMA,USMA {
	
	public void medicalservice() {
		System.out.println("NobelHosipatal....medicalservice()");
	}

	@Override
	public void physio() {
		System.out.println("NobelHosipatal...physioservice()");
	}

	@Override
	public void cardio() {
		System.out.println("NobelHosipatal...cardioservice()");
	}

	@Override
	public void neuro() {
		System.out.println("NobelHosipatal...neuroservice()");
	}

	@Override
	public void dental() {
		System.out.println("NobelHosipatal...dentalservice()");
	}

	@Override
	public void covid9Test() {
		System.out.println("NobelHosipatal...covid9Test()");
	}
}
