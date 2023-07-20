package com.shubhi.maheshwari.api.resources.settlements;

import com.shubhi.maheshwari.api.types.SettlementsEntity;

public interface SettlementsClient {
  SettlementsEntity getsettlements(String orderId);
}
