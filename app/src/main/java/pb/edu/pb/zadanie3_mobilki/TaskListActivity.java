package pb.edu.pb.zadanie3_mobilki;


import androidx.fragment.app.Fragment;


public class TaskListActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}