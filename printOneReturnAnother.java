function printOneReturnAnother(arr)
{
	var max = arr[0];
	var twomax = arr[0];
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]>max)
		{
			max = arr[i];
		}
	}
	for (var i = 0; i < arr.length; i++)
	{
		if (max == arr[i])
		{
			arr[i]=0;
		}
	}
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]>twomax)
		{
			twomax = arr[i];
		}
	}
	console.log(twomax);
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]%2==1)
		{
			return arr[i];
		}
	}
}
