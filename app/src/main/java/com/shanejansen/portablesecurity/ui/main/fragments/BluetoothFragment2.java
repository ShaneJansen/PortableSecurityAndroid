package com.shanejansen.portablesecurity.ui.main.fragments;

/**
 * Created by Shane Jansen on 4/7/15.
 *
 * Activity for PathChecker
 */
public class BluetoothFragment2 { //extends Fragment implements View.OnClickListener {
  // Constants
  /*public static final int REQUEST_ENABLE_BT = 1;

  // Instances
  private BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
  private TransactionInterface mTransactionInterface;
  private BluetoothConnectionHelper mConnectionHelper;

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
      mTransactionInterface = (TransactionInterface) getActivity();
    } catch (ClassCastException e) {
      throw new ClassCastException(
          getActivity().toString() + " must implement TransactionInterface");
    }
  }

  @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View v = inflater.inflate(R.layout.fragment_bluetooth, container, false);

    // Finding views
    Button btnFindDevice = (Button) v.findViewById(R.id.btnFindDevice);
    btnFindDevice.setOnClickListener(this);

    mConnectionHelper =
        new BluetoothConnectionHelper(getActivity(), new BluetoothConnectionHandler(getActivity()),
            mBluetoothAdapter);
    checkBluetoothState();

    return v;
  }

  @Override public void onPause() {
    if (mBluetoothAdapter != null) {
      mConnectionHelper.finishedSearching();
    }
    super.onPause();
  }

  @Override public void onClick(View view) {
    switch (view.getId()) {
      case R.id.btnFindDevice:
        mConnectionHelper.discoverDevices();
        break;
    }
  }

  @Override public void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (requestCode == REQUEST_ENABLE_BT) {
      if (resultCode == Activity.RESULT_OK) {
        // Bluetooth enabled successfully
        Toast.makeText(getActivity(), "Ready to discover devices.", Toast.LENGTH_SHORT).show();
      } else {
        // Bluetooth could not be enabled
        mTransactionInterface.removeCurrentFragment();
      }
    }
  }*/

  /**
   * Check if bluetooth is available for this device.
   * Check if bluetooth is turned on for this device
   * and requests to turn it on if not.
   */
  /*private void checkBluetoothState() {
    if (mBluetoothAdapter == null) {
      // Device does not support bluetooth. Exit the fragment
      new AlertDialog.Builder(getActivity()).setTitle("Bluetooth Not Supported")
          .setMessage("Your device does not support bluetooth.")
          .setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override public void onClick(DialogInterface dialog, int which) {
              mTransactionInterface.removeCurrentFragment();
            }
          })
          .show();
    } else {
      if (!mBluetoothAdapter.isEnabled()) {
        // Bluetooth is not enabled. Request to enable it
        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
      } else {
        Toast.makeText(getActivity(), "Ready to discover devices.", Toast.LENGTH_SHORT).show();
      }
    }
  }*/
}
