Blended
=======

Blended is an Android library that allows for a RecyclerView Adapter to contain a list of multiple types of items, each with a different layout and blends them into a single RecyclerView.

![blendeddemo](https://cloud.githubusercontent.com/assets/4675165/5670510/6c41fd88-974e-11e4-94c2-fc2e549a960e.png)

Usage
=====

You will need to include this in your gradle dependencies before you begin:

		compile 'com.android.support:appcompat-v7:21.0.3'
	    compile 'com.android.support:recyclerview-v7:+'
	    compile 'com.jakewharton:butterknife:6.0.0'
	    compile 'com.timehop.stickyheadersrecyclerview:library:0.3.3@aar'

1. Clone this repository.  Open your project in Android Studio and go to File > Import Module and select the blendedlibrary folder, from whatever directory you cloned it to.

2. Create your models that will be in the list and have each of them implement ModelViewHolder.  They will each use their own layout resource file, header title, and view holder in the bindViewHolder() method.  Implementation could look something like this:

		@Override
	    public void bindViewHolder(BlendedRecyclerViewAdapter.RecyclerViewBaseHolder vh) {
	        ((SoccerPlayerViewHolder) vh).soccerPlayerName.setText(getmName());
	    }

	    @Override
	    public String getHeaderTitle() {
	        return "SOCCER PLAYERS";
	    }

	    @Override
	    public int getResourceLayoutId() {
	        return R.layout.list_item_soccer_player;
	    }

3. Create layout resource files for each model's list item. In this example the layout resource file has this textview:

        <TextView
            android:id="@+id/soccer_player_name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_toRightOf="@id/image"
            android:layout_centerVertical="true" />


4. Create ViewHolders for each model.  ViewHolders could look something like this:

		public class SoccerPlayerViewHolder extends BlendedRecyclerViewAdapter.RecyclerViewBaseHolder {

		    @InjectView(R.id.soccer_player_name)
		    public TextView soccerPlayerName;

		    public SoccerPlayerViewHolder(View view, BlendedRecyclerViewAdapter adapter) {
		        super(view, adapter);
		        ButterKnife.inject(this, view);
		    }
		}	


5. Populate your list in your own way and setup your RecyclerView with a BlendedRecyclerViewAdapter.

		public class MainActivity<T extends ModelViewHolder> extends ActionBarActivity {

		    RecyclerView mRecyclerView;

		    BlendedRecyclerViewAdapter mBlendedRecyclerViewAdapter;

		    List<T> mList = new ArrayList<>();

		    @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.activity_main);

		        populateList();

		        mBlendedRecyclerViewAdapter = new BlendedRecyclerViewAdapter();

		        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

		        mRecyclerView.setHasFixedSize(true);
		        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		        mRecyclerView.setLayoutManager(layoutManager);
		        mRecyclerView.setAdapter(mBlendedRecyclerViewAdapter);
		        mRecyclerView.addItemDecoration(new StickyRecyclerHeadersDecoration(mBlendedRecyclerViewAdapter));

		        mBlendedRecyclerViewAdapter(mList);
		    } 
		}


And that's it!

Credits
=======

[Butterknife][1]

[StickyHeadersRecyclerView][2]


[1]: https://github.com/JakeWharton/butterknife
[2]: https://github.com/timehop/sticky-headers-recyclerview
