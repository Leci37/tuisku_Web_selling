//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: BNBUSDT_30Min_2MM0_7d8bd79b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_2MM0_7d8bd79b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_7d8bd79b(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Short_MA <= 210.085 )
		if( Negative_Money_Flow_Sum <= 7.92322e+07 )
			if( Positive_Money_Flow <= 1.72211e+06 )
				if( Positive_Money_Flow <= 1.20068e+06 )
					if( Short_Long_Diff <= 1.07751 )
						if( Positive_Money_Flow_Sum <= 1.65739e+07 )
							if( Negative_Money_Flow <= 1.70113e+06 )
								if( Money_Flow_Ratio <= 0.225647 )
									ret := 0.421053
								if( Money_Flow_Ratio > 0.225647 )
									ret := 0.066722
							if( Negative_Money_Flow > 1.70113e+06 )
								if( Money_Flow_Ratio <= 0.144339 )
									ret := -0.282609
								if( Money_Flow_Ratio > 0.144339 )
									ret := 0.271905
						if( Positive_Money_Flow_Sum > 1.65739e+07 )
							if( Raw_Money_Flow <= 1.4059e+06 )
								if( Positive_Money_Flow_Sum <= 1.80089e+07 )
									ret := -0.089286
								if( Positive_Money_Flow_Sum > 1.80089e+07 )
									ret := 0.291105
							if( Raw_Money_Flow > 1.4059e+06 )
								if( Money_Flow_Ratio <= 0.357071 )
									ret := -0.760000 // sell
								if( Money_Flow_Ratio > 0.357071 )
									ret := -0.024216
					if( Short_Long_Diff > 1.07751 )
						if( Short_Long_Diff <= 1.91249 )
							if( Typical_Price <= 98.7726 )
								if( Money_Flow_Ratio <= 3.34865 )
									ret := 0.977273 // buy
								if( Money_Flow_Ratio > 3.34865 )
									ret := 0.090909
							if( Typical_Price > 98.7726 )
								if( Positive_Money_Flow_Sum <= 9.98334e+07 )
									ret := 0.395349
								if( Positive_Money_Flow_Sum > 9.98334e+07 )
									ret := -0.600000
						if( Short_Long_Diff > 1.91249 )
							if( Positive_Money_Flow_Sum <= 1.64619e+08 )
								if( Positive_Money_Flow_Sum <= 1.01743e+08 )
									ret := 0.058824
								if( Positive_Money_Flow_Sum > 1.01743e+08 )
									ret := -0.705882 // sell
							if( Positive_Money_Flow_Sum > 1.64619e+08 )
								if( Raw_Money_Flow <= 1.83447e+07 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 1.83447e+07 )
									ret := 1.000000 // buy
				if( Positive_Money_Flow > 1.20068e+06 )
					if( MFI_High <= -10.7602 )
						if( MFI_Low <= 22.4384 )
							if( Long_MA <= 28.1522 )
								if( MFI <= 32.7191 )
									ret := 0.459459
								if( MFI > 32.7191 )
									ret := -0.235294
							if( Long_MA > 28.1522 )
								if( Money_Flow_Ratio <= 0.608137 )
									ret := 0.348387
								if( Money_Flow_Ratio > 0.608137 )
									ret := 0.611111
						if( MFI_Low > 22.4384 )
							if( Positive_Money_Flow_Sum <= 1.7778e+07 )
								if( Money_Flow_Ratio <= 0.999866 )
									ret := -0.120968
								if( Money_Flow_Ratio > 0.999866 )
									ret := 0.276316
							if( Positive_Money_Flow_Sum > 1.7778e+07 )
								if( Typical_Price <= 141.257 )
									ret := -0.308271
								if( Typical_Price > 141.257 )
									ret := 0.205882
					if( MFI_High > -10.7602 )
						if( Short_Long_Diff <= 0.112355 )
							if( Negative_Money_Flow_Sum <= 4.41914e+06 )
								if( Positive_Money_Flow <= 1.27364e+06 )
									ret := 0.600000
								if( Positive_Money_Flow > 1.27364e+06 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 4.41914e+06 )
								if( Short_Long_Diff <= 0.088659 )
									ret := 0.761905 // buy
								if( Short_Long_Diff > 0.088659 )
									ret := 0.000000
						if( Short_Long_Diff > 0.112355 )
							if( Negative_Money_Flow_Sum <= 4.43396e+06 )
								if( Raw_Money_Flow <= 1.36136e+06 )
									ret := 0.800000 // buy
								if( Raw_Money_Flow > 1.36136e+06 )
									ret := -0.375000
							if( Negative_Money_Flow_Sum > 4.43396e+06 )
								if( Positive_Money_Flow_Sum <= 3.36669e+07 )
									ret := 0.504202
								if( Positive_Money_Flow_Sum > 3.36669e+07 )
									ret := -0.750000 // sell
			if( Positive_Money_Flow > 1.72211e+06 )
				if( Positive_Money_Flow_Sum <= 9.21042e+07 )
					if( Negative_Money_Flow_Sum <= 3.86493e+07 )
						if( Negative_Money_Flow_Sum <= 2.23005e+07 )
							if( MA_Cross <= 6.18323 )
								if( Short_MA <= 29.2384 )
									ret := -0.163170
								if( Short_MA > 29.2384 )
									ret := 0.058824
							if( MA_Cross > 6.18323 )
								if( Positive_Money_Flow_Sum <= 1.34692e+07 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 1.34692e+07 )
									ret := -0.507576
						if( Negative_Money_Flow_Sum > 2.23005e+07 )
							if( MFI_Low <= 2.70543 )
								if( Typical_Price <= 205.84 )
									ret := -0.850000 // sell
								if( Typical_Price > 205.84 )
									ret := 0.000000
							if( MFI_Low > 2.70543 )
								if( Raw_Money_Flow <= 5.57242e+06 )
									ret := 0.322820
								if( Raw_Money_Flow > 5.57242e+06 )
									ret := -0.208791
					if( Negative_Money_Flow_Sum > 3.86493e+07 )
						if( Negative_Money_Flow_Sum <= 4.16697e+07 )
							if( Short_MA <= 49.9712 )
								if( Typical_Price <= 34.9635 )
									ret := -0.916667 // sell
								if( Typical_Price > 34.9635 )
									ret := 0.000000
							if( Short_MA > 49.9712 )
								if( Money_Flow_Ratio <= 1.80502 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 1.80502 )
									ret := -0.500000
						if( Negative_Money_Flow_Sum > 4.16697e+07 )
							if( Short_Long_Diff <= 0.549353 )
								if( MFI_High <= -60.8783 )
									ret := 0.320000
								if( MFI_High > -60.8783 )
									ret := -0.269103
							if( Short_Long_Diff > 0.549353 )
								if( Raw_Money_Flow <= 5.88937e+06 )
									ret := 0.125000
								if( Raw_Money_Flow > 5.88937e+06 )
									ret := 0.750000 // buy
				if( Positive_Money_Flow_Sum > 9.21042e+07 )
					if( Short_Long_Diff <= 2.22016 )
						if( Typical_Price <= 131.069 )
							if( Long_MA <= 54.2999 )
								ret := -0.142857
							if( Long_MA > 54.2999 )
								if( Negative_Money_Flow_Sum <= 6.70688e+07 )
									ret := 0.966102 // buy
								if( Negative_Money_Flow_Sum > 6.70688e+07 )
									ret := 0.461538
						if( Typical_Price > 131.069 )
							if( Negative_Money_Flow_Sum <= 5.1297e+07 )
								if( Positive_Money_Flow_Sum <= 1.01899e+08 )
									ret := 0.538462
								if( Positive_Money_Flow_Sum > 1.01899e+08 )
									ret := -0.480000
							if( Negative_Money_Flow_Sum > 5.1297e+07 )
								if( Positive_Money_Flow_Sum <= 9.46365e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 9.46365e+07 )
									ret := 0.964286 // buy
					if( Short_Long_Diff > 2.22016 )
						if( MFI_Low <= 64.4232 )
							if( Positive_Money_Flow <= 1.08168e+07 )
								ret := -0.250000
							if( Positive_Money_Flow > 1.08168e+07 )
								if( Long_MA <= 88.8375 )
									ret := -0.800000 // sell
								if( Long_MA > 88.8375 )
									ret := -1.000000 // sell
						if( MFI_Low > 64.4232 )
							if( MFI <= 91.9699 )
								if( Positive_Money_Flow <= 4.21066e+07 )
									ret := 0.400000
								if( Positive_Money_Flow > 4.21066e+07 )
									ret := 1.000000 // buy
							if( MFI > 91.9699 )
								if( Long_MA <= 119.267 )
									ret := -0.750000 // sell
								if( Long_MA > 119.267 )
									ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 7.92322e+07 )
			if( Negative_Money_Flow_Sum <= 1.27571e+08 )
				if( MFI_High <= -24.1211 )
					if( Positive_Money_Flow_Sum <= 1.06542e+08 )
						if( Positive_Money_Flow_Sum <= 8.40216e+07 )
							if( Typical_Price <= 149.997 )
								if( Positive_Money_Flow <= 1.11718e+07 )
									ret := 0.813559 // buy
								if( Positive_Money_Flow > 1.11718e+07 )
									ret := 0.285714
							if( Typical_Price > 149.997 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 8.40216e+07 )
							if( MFI_High <= -28.2811 )
								if( Negative_Money_Flow_Sum <= 9.57631e+07 )
									ret := -0.636364
								if( Negative_Money_Flow_Sum > 9.57631e+07 )
									ret := 0.800000 // buy
							if( MFI_High > -28.2811 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.06542e+08 )
						if( Negative_Money_Flow <= 1.14913e+07 )
							if( Positive_Money_Flow <= 1.16831e+07 )
								ret := 0.250000
							if( Positive_Money_Flow > 1.16831e+07 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.14913e+07 )
							ret := -1.000000 // sell
				if( MFI_High > -24.1211 )
					if( Short_MA <= 91.4747 )
						if( MFI_High <= -20.5684 )
							ret := 1.000000 // buy
						if( MFI_High > -20.5684 )
							ret := 0.400000
					if( Short_MA > 91.4747 )
						if( Raw_Money_Flow <= 6.34827e+07 )
							if( Money_Flow_Ratio <= 1.49148 )
								if( Short_MA <= 140.697 )
									ret := 0.750000 // buy
								if( Short_MA > 140.697 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 1.49148 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 6.34827e+07 )
							ret := 0.714286 // buy
			if( Negative_Money_Flow_Sum > 1.27571e+08 )
				if( Positive_Money_Flow_Sum <= 9.28965e+07 )
					if( Typical_Price <= 123.931 )
						if( MFI_Low <= 11.8825 )
							ret := 0.800000 // buy
						if( MFI_Low > 11.8825 )
							ret := -0.250000
					if( Typical_Price > 123.931 )
						ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 9.28965e+07 )
					if( Short_MA <= 166.484 )
						if( Positive_Money_Flow <= 2.9691e+07 )
							if( Negative_Money_Flow_Sum <= 1.48527e+08 )
								if( Short_Long_Diff <= 0.561088 )
									ret := -0.772727 // sell
								if( Short_Long_Diff > 0.561088 )
									ret := 0.133333
							if( Negative_Money_Flow_Sum > 1.48527e+08 )
								if( Positive_Money_Flow <= 1.0144e+07 )
									ret := 0.604651
								if( Positive_Money_Flow > 1.0144e+07 )
									ret := 0.000000
						if( Positive_Money_Flow > 2.9691e+07 )
							if( Short_MA <= 126.159 )
								ret := 0.000000
							if( Short_MA > 126.159 )
								if( Typical_Price <= 136.958 )
									ret := -0.750000 // sell
								if( Typical_Price > 136.958 )
									ret := -1.000000 // sell
					if( Short_MA > 166.484 )
						if( Positive_Money_Flow_Sum <= 1.3419e+08 )
							if( Positive_Money_Flow <= 9.89626e+06 )
								if( Typical_Price <= 195.9 )
									ret := 1.000000 // buy
								if( Typical_Price > 195.9 )
									ret := -0.500000
							if( Positive_Money_Flow > 9.89626e+06 )
								ret := -0.571429
						if( Positive_Money_Flow_Sum > 1.3419e+08 )
							if( Positive_Money_Flow_Sum <= 2.52531e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.52531e+08 )
								if( Negative_Money_Flow <= 2.95771e+07 )
									ret := 0.071429
								if( Negative_Money_Flow > 2.95771e+07 )
									ret := 0.764706 // buy
	if( Short_MA > 210.085 )
		if( Negative_Money_Flow <= 1.23843e+08 )
			if( Typical_Price <= 577.583 )
				if( Negative_Money_Flow <= 1.2579e+07 )
					if( Negative_Money_Flow_Sum <= 7.67376e+06 )
						if( Short_Long_Diff <= 1.05476 )
							if( Raw_Money_Flow <= 1.7592e+06 )
								if( Short_Long_Diff <= 0.917168 )
									ret := 0.040782
								if( Short_Long_Diff > 0.917168 )
									ret := -0.147887
							if( Raw_Money_Flow > 1.7592e+06 )
								if( MFI <= 66.5608 )
									ret := -0.004505
								if( MFI > 66.5608 )
									ret := 0.241316
						if( Short_Long_Diff > 1.05476 )
							if( MFI <= 88.6915 )
								if( Negative_Money_Flow_Sum <= 3.94996e+06 )
									ret := -0.036036
								if( Negative_Money_Flow_Sum > 3.94996e+06 )
									ret := 0.310494
							if( MFI > 88.6915 )
								if( Short_Long_Diff <= 3.24896 )
									ret := 0.139241
								if( Short_Long_Diff > 3.24896 )
									ret := -0.158333
					if( Negative_Money_Flow_Sum > 7.67376e+06 )
						if( Positive_Money_Flow_Sum <= 1.96606e+07 )
							if( Positive_Money_Flow_Sum <= 9.13248e+06 )
								if( Raw_Money_Flow <= 2.46045e+06 )
									ret := 0.017548
								if( Raw_Money_Flow > 2.46045e+06 )
									ret := 0.159314
							if( Positive_Money_Flow_Sum > 9.13248e+06 )
								if( Short_Long_Diff <= -6.21129 )
									ret := 0.235577
								if( Short_Long_Diff > -6.21129 )
									ret := -0.023028
						if( Positive_Money_Flow_Sum > 1.96606e+07 )
							if( MFI_High <= -15.851 )
								if( MFI_Low <= -4.43684 )
									ret := -0.448000
								if( MFI_Low > -4.43684 )
									ret := 0.062705
							if( MFI_High > -15.851 )
								if( Raw_Money_Flow <= 1.95967e+07 )
									ret := -0.023465
								if( Raw_Money_Flow > 1.95967e+07 )
									ret := 0.089490
				if( Negative_Money_Flow > 1.2579e+07 )
					if( Negative_Money_Flow_Sum <= 5.60017e+07 )
						if( Positive_Money_Flow_Sum <= 2.37902e+08 )
							if( Positive_Money_Flow_Sum <= 1.75825e+08 )
								if( Negative_Money_Flow_Sum <= 2.75726e+07 )
									ret := -0.477273
								if( Negative_Money_Flow_Sum > 2.75726e+07 )
									ret := -0.066802
							if( Positive_Money_Flow_Sum > 1.75825e+08 )
								if( MFI <= 83.2275 )
									ret := -0.888889 // sell
								if( MFI > 83.2275 )
									ret := 0.400000
						if( Positive_Money_Flow_Sum > 2.37902e+08 )
							if( Short_Long_Diff <= 11.7192 )
								if( MFI_High <= 3.33016 )
									ret := 1.000000 // buy
								if( MFI_High > 3.33016 )
									ret := 0.750000 // buy
							if( Short_Long_Diff > 11.7192 )
								ret := 0.250000
					if( Negative_Money_Flow_Sum > 5.60017e+07 )
						if( Positive_Money_Flow_Sum <= 1.04582e+08 )
							if( Negative_Money_Flow <= 8.32492e+07 )
								if( Negative_Money_Flow_Sum <= 8.49798e+07 )
									ret := 0.063866
								if( Negative_Money_Flow_Sum > 8.49798e+07 )
									ret := 0.267936
							if( Negative_Money_Flow > 8.32492e+07 )
								if( Long_MA <= 435.933 )
									ret := -0.600000
								if( Long_MA > 435.933 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.04582e+08 )
							if( Negative_Money_Flow_Sum <= 6.06566e+08 )
								if( Short_Long_Diff <= 4.98501 )
									ret := -0.016421
								if( Short_Long_Diff > 4.98501 )
									ret := 0.212766
							if( Negative_Money_Flow_Sum > 6.06566e+08 )
								if( Negative_Money_Flow <= 4.30114e+07 )
									ret := -0.068627
								if( Negative_Money_Flow > 4.30114e+07 )
									ret := 0.508065
			if( Typical_Price > 577.583 )
				if( MFI_High <= -60.5134 )
					if( Raw_Money_Flow <= 2.36323e+07 )
						if( Negative_Money_Flow_Sum <= 1.55637e+08 )
							if( Raw_Money_Flow <= 9.05688e+06 )
								if( MFI_Low <= -3.37694 )
									ret := -0.041667
								if( MFI_Low > -3.37694 )
									ret := 0.166667
							if( Raw_Money_Flow > 9.05688e+06 )
								if( Short_Long_Diff <= -6.32222 )
									ret := 0.777778 // buy
								if( Short_Long_Diff > -6.32222 )
									ret := 0.157895
						if( Negative_Money_Flow_Sum > 1.55637e+08 )
							if( MFI_High <= -62.5357 )
								if( Long_MA <= 633.294 )
									ret := -1.000000 // sell
								if( Long_MA > 633.294 )
									ret := -0.200000
							if( MFI_High > -62.5357 )
								ret := 0.250000
					if( Raw_Money_Flow > 2.36323e+07 )
						if( Negative_Money_Flow_Sum <= 3.31076e+08 )
							if( MFI_Low <= -8.76264 )
								ret := 1.000000 // buy
							if( MFI_Low > -8.76264 )
								if( MFI_Low <= -3.6898 )
									ret := 0.142857
								if( MFI_Low > -3.6898 )
									ret := -0.333333
						if( Negative_Money_Flow_Sum > 3.31076e+08 )
							if( Negative_Money_Flow_Sum <= 5.48094e+08 )
								if( Raw_Money_Flow <= 2.76914e+07 )
									ret := 0.571429
								if( Raw_Money_Flow > 2.76914e+07 )
									ret := 0.972222 // buy
							if( Negative_Money_Flow_Sum > 5.48094e+08 )
								ret := 0.250000
				if( MFI_High > -60.5134 )
					if( Positive_Money_Flow_Sum <= 2.05664e+08 )
						if( Negative_Money_Flow_Sum <= 1.608e+08 )
							if( Positive_Money_Flow_Sum <= 1.97391e+08 )
								if( Positive_Money_Flow <= 1.44293e+07 )
									ret := -0.055391
								if( Positive_Money_Flow > 1.44293e+07 )
									ret := 0.161290
							if( Positive_Money_Flow_Sum > 1.97391e+08 )
								if( Raw_Money_Flow <= 1.96485e+07 )
									ret := -0.285714
								if( Raw_Money_Flow > 1.96485e+07 )
									ret := -0.857143 // sell
						if( Negative_Money_Flow_Sum > 1.608e+08 )
							if( MFI_Low <= 15.2556 )
								if( Positive_Money_Flow_Sum <= 1.02312e+08 )
									ret := 0.206522
								if( Positive_Money_Flow_Sum > 1.02312e+08 )
									ret := -0.273256
							if( MFI_Low > 15.2556 )
								if( Negative_Money_Flow_Sum <= 2.05454e+08 )
									ret := -0.387097
								if( Negative_Money_Flow_Sum > 2.05454e+08 )
									ret := -0.725000 // sell
					if( Positive_Money_Flow_Sum > 2.05664e+08 )
						if( Positive_Money_Flow_Sum <= 3.66681e+08 )
							if( Negative_Money_Flow_Sum <= 1.60882e+08 )
								if( Long_MA <= 640.26 )
									ret := 0.103175
								if( Long_MA > 640.26 )
									ret := -0.414634
							if( Negative_Money_Flow_Sum > 1.60882e+08 )
								if( Negative_Money_Flow_Sum <= 2.12444e+08 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 2.12444e+08 )
									ret := 0.180905
						if( Positive_Money_Flow_Sum > 3.66681e+08 )
							if( Short_Long_Diff <= -14.3803 )
								if( Money_Flow_Ratio <= 0.648654 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.648654 )
									ret := 0.750000 // buy
							if( Short_Long_Diff > -14.3803 )
								if( Negative_Money_Flow_Sum <= 4.10964e+08 )
									ret := -0.137441
								if( Negative_Money_Flow_Sum > 4.10964e+08 )
									ret := -0.698413
		if( Negative_Money_Flow > 1.23843e+08 )
			if( Positive_Money_Flow_Sum <= 3.88748e+07 )
				ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 3.88748e+07 )
				if( MFI_Low <= 8.09432 )
					if( Positive_Money_Flow_Sum <= 1.16039e+08 )
						if( Short_Long_Diff <= -9.69626 )
							ret := 1.000000 // buy
						if( Short_Long_Diff > -9.69626 )
							ret := 0.000000
					if( Positive_Money_Flow_Sum > 1.16039e+08 )
						if( Typical_Price <= 307.985 )
							ret := 0.750000 // buy
						if( Typical_Price > 307.985 )
							ret := 1.000000 // buy
				if( MFI_Low > 8.09432 )
					if( Short_Long_Diff <= -8.26513 )
						if( Negative_Money_Flow <= 1.36215e+08 )
							ret := 0.250000
						if( Negative_Money_Flow > 1.36215e+08 )
							if( Positive_Money_Flow_Sum <= 5.07579e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.07579e+08 )
								ret := 0.750000 // buy
					if( Short_Long_Diff > -8.26513 )
						if( Negative_Money_Flow <= 1.27422e+08 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 1.27422e+08 )
							if( Short_Long_Diff <= 19.0436 )
								if( Negative_Money_Flow <= 1.89243e+08 )
									ret := 0.166667
								if( Negative_Money_Flow > 1.89243e+08 )
									ret := -1.000000 // sell
							if( Short_Long_Diff > 19.0436 )
								ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_BNBUSDT_30Min_7d8bd79b(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


