//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: LTCUSDT_30Min_2BM0_60877c50 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_30Min_2BM0_60877c50", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_30Min_60877c50(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.794872 )
		if( Typical_Price <= 365.486 )
			if( Negative_Money_Flow <= 2.62733e+06 )
				if( Negative_Money_Flow_Sum <= 1.80618e+08 )
					if( Positive_Money_Flow_Sum <= 1.26333e+08 )
						if( Negative_Money_Flow_Sum <= 2.08546e+07 )
							if( bullPower <= 0.879469 )
								if( Negative_Money_Flow_Sum <= 1.05145e+07 )
									ret := 0.084447
								if( Negative_Money_Flow_Sum > 1.05145e+07 )
									ret := 0.166172
							if( bullPower > 0.879469 )
								if( MFI_Low <= 61.1186 )
									ret := -0.075506
								if( MFI_Low > 61.1186 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.08546e+07 )
							if( Money_Flow_Ratio <= 1.3633 )
								if( Negative_Money_Flow_Sum <= 2.10839e+07 )
									ret := -0.481928
								if( Negative_Money_Flow_Sum > 2.10839e+07 )
									ret := 0.030475
							if( Money_Flow_Ratio > 1.3633 )
								if( Positive_Money_Flow <= 1.91453e+07 )
									ret := 0.329870
								if( Positive_Money_Flow > 1.91453e+07 )
									ret := -0.619048
					if( Positive_Money_Flow_Sum > 1.26333e+08 )
						if( Negative_Money_Flow_Sum <= 1.68684e+08 )
							if( bbm <= 3.94765 )
								if( Typical_Price <= 244.928 )
									ret := 0.875000 // buy
								if( Typical_Price > 244.928 )
									ret := -1.000000 // sell
							if( bbm > 3.94765 )
								if( bullPower <= 13.1757 )
									ret := 0.722222 // buy
								if( bullPower > 13.1757 )
									ret := 0.000000
						if( Negative_Money_Flow_Sum > 1.68684e+08 )
							if( Raw_Money_Flow <= 1.26551e+07 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.26551e+07 )
								if( bearPower <= -9.56378 )
									ret := 0.300000
								if( bearPower > -9.56378 )
									ret := -0.833333 // sell
				if( Negative_Money_Flow_Sum > 1.80618e+08 )
					if( Negative_Money_Flow_Sum <= 2.93601e+08 )
						if( Positive_Money_Flow <= 3.62679e+07 )
							if( Positive_Money_Flow_Sum <= 4.71108e+07 )
								if( Negative_Money_Flow_Sum <= 2.39641e+08 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 2.39641e+08 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 4.71108e+07 )
								if( Positive_Money_Flow <= 1.73581e+07 )
									ret := -0.909091 // sell
								if( Positive_Money_Flow > 1.73581e+07 )
									ret := -0.575758
						if( Positive_Money_Flow > 3.62679e+07 )
							ret := 0.750000 // buy
					if( Negative_Money_Flow_Sum > 2.93601e+08 )
						if( MFI <= 37.4616 )
							if( Typical_Price <= 324.635 )
								if( MFI <= 29.6896 )
									ret := 1.000000 // buy
								if( MFI > 29.6896 )
									ret := 0.750000 // buy
							if( Typical_Price > 324.635 )
								ret := -0.750000 // sell
						if( MFI > 37.4616 )
							if( bearPower <= -13.6496 )
								ret := 0.250000
							if( bearPower > -13.6496 )
								if( Negative_Money_Flow_Sum <= 4.16168e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.16168e+08 )
									ret := -0.750000 // sell
			if( Negative_Money_Flow > 2.62733e+06 )
				if( Typical_Price <= 175.283 )
					if( Raw_Money_Flow <= 9.75983e+06 )
						if( bbp <= -1.49075 )
							if( Positive_Money_Flow_Sum <= 4.9441e+07 )
								if( Money_Flow_Ratio <= 0.263577 )
									ret := 0.121379
								if( Money_Flow_Ratio > 0.263577 )
									ret := 0.283298
							if( Positive_Money_Flow_Sum > 4.9441e+07 )
								if( MFI_High <= -34.365 )
									ret := 0.275000
								if( MFI_High > -34.365 )
									ret := -0.682927
						if( bbp > -1.49075 )
							if( bbm <= 3.00071 )
								if( MFI_High <= -33.425 )
									ret := -0.083156
								if( MFI_High > -33.425 )
									ret := 0.131183
							if( bbm > 3.00071 )
								if( MFI_Low <= 31.3831 )
									ret := 0.551724
								if( MFI_Low > 31.3831 )
									ret := 0.117647
					if( Raw_Money_Flow > 9.75983e+06 )
						if( Positive_Money_Flow_Sum <= 1.32256e+07 )
							if( MFI_Low <= -6.39535 )
								if( bbp <= -9.74847 )
									ret := 0.800000 // buy
								if( bbp > -9.74847 )
									ret := 0.333333
							if( MFI_Low > -6.39535 )
								if( Positive_Money_Flow_Sum <= 5.1577e+06 )
									ret := 0.533333
								if( Positive_Money_Flow_Sum > 5.1577e+06 )
									ret := -0.370370
						if( Positive_Money_Flow_Sum > 1.32256e+07 )
							if( Positive_Money_Flow_Sum <= 1.71139e+07 )
								if( Typical_Price <= 156.775 )
									ret := 0.912281 // buy
								if( Typical_Price > 156.775 )
									ret := 0.461538
							if( Positive_Money_Flow_Sum > 1.71139e+07 )
								if( Raw_Money_Flow <= 2.15861e+07 )
									ret := 0.430481
								if( Raw_Money_Flow > 2.15861e+07 )
									ret := 0.781818 // buy
				if( Typical_Price > 175.283 )
					if( Negative_Money_Flow_Sum <= 7.44971e+07 )
						if( Negative_Money_Flow_Sum <= 3.43501e+07 )
							if( Positive_Money_Flow_Sum <= 4.39216e+07 )
								if( Positive_Money_Flow_Sum <= 2.02038e+07 )
									ret := 0.185864
								if( Positive_Money_Flow_Sum > 2.02038e+07 )
									ret := -0.206349
							if( Positive_Money_Flow_Sum > 4.39216e+07 )
								if( bbm <= 6.44978 )
									ret := 0.578947
								if( bbm > 6.44978 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 3.43501e+07 )
							if( Positive_Money_Flow_Sum <= 9.14273e+07 )
								if( Positive_Money_Flow_Sum <= 8.8771e+07 )
									ret := 0.199830
								if( Positive_Money_Flow_Sum > 8.8771e+07 )
									ret := -0.764706 // sell
							if( Positive_Money_Flow_Sum > 9.14273e+07 )
								if( Positive_Money_Flow_Sum <= 1.63056e+08 )
									ret := 0.627273
								if( Positive_Money_Flow_Sum > 1.63056e+08 )
									ret := -0.857143 // sell
					if( Negative_Money_Flow_Sum > 7.44971e+07 )
						if( bullPower <= -1.26139 )
							if( Negative_Money_Flow_Sum <= 3.12e+08 )
								if( Raw_Money_Flow <= 5.32303e+07 )
									ret := 0.079457
								if( Raw_Money_Flow > 5.32303e+07 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 3.12e+08 )
								if( MFI_High <= -33.772 )
									ret := 0.966667 // buy
								if( MFI_High > -33.772 )
									ret := -0.166667
						if( bullPower > -1.26139 )
							if( MFI_High <= -52.8072 )
								if( Typical_Price <= 342.928 )
									ret := -0.803571 // sell
								if( Typical_Price > 342.928 )
									ret := -0.200000
							if( MFI_High > -52.8072 )
								if( Negative_Money_Flow_Sum <= 7.90377e+07 )
									ret := -0.550000
								if( Negative_Money_Flow_Sum > 7.90377e+07 )
									ret := 0.008403
		if( Typical_Price > 365.486 )
			if( Raw_Money_Flow <= 3.03384e+07 )
				if( MFI_Low <= 35.289 )
					if( bearPower <= -9.10094 )
						if( Typical_Price <= 372.714 )
							ret := -1.000000 // sell
						if( Typical_Price > 372.714 )
							ret := 0.000000
					if( bearPower > -9.10094 )
						if( Raw_Money_Flow <= 8.24572e+06 )
							ret := -0.750000 // sell
						if( Raw_Money_Flow > 8.24572e+06 )
							if( Positive_Money_Flow_Sum <= 8.05824e+07 )
								ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 8.05824e+07 )
								ret := -1.000000 // sell
				if( MFI_Low > 35.289 )
					ret := 0.200000
			if( Raw_Money_Flow > 3.03384e+07 )
				ret := 0.571429
	if( bearPower > -0.794872 )
		if( Negative_Money_Flow <= 1.44382e+06 )
			if( Negative_Money_Flow_Sum <= 2.63493e+07 )
				if( bearPower <= -0.432659 )
					if( Positive_Money_Flow_Sum <= 1.61522e+07 )
						if( Typical_Price <= 69.0683 )
							if( Positive_Money_Flow_Sum <= 1.17282e+07 )
								if( Negative_Money_Flow <= 404296 )
									ret := 0.081609
								if( Negative_Money_Flow > 404296 )
									ret := 0.215278
							if( Positive_Money_Flow_Sum > 1.17282e+07 )
								if( Typical_Price <= 66.1785 )
									ret := -0.375000
								if( Typical_Price > 66.1785 )
									ret := 0.714286 // buy
						if( Typical_Price > 69.0683 )
							if( bullPower <= -0.087473 )
								if( Positive_Money_Flow <= 1.18529e+06 )
									ret := -0.054534
								if( Positive_Money_Flow > 1.18529e+06 )
									ret := -0.345455
							if( bullPower > -0.087473 )
								if( Typical_Price <= 113.055 )
									ret := 0.066233
								if( Typical_Price > 113.055 )
									ret := -0.038688
					if( Positive_Money_Flow_Sum > 1.61522e+07 )
						if( bearPower <= -0.63528 )
							if( Typical_Price <= 83.4281 )
								if( bearPower <= -0.735144 )
									ret := -0.090909
								if( bearPower > -0.735144 )
									ret := 0.705882 // buy
							if( Typical_Price > 83.4281 )
								if( bullPower <= 0.107495 )
									ret := -0.500000
								if( bullPower > 0.107495 )
									ret := 0.054545
						if( bearPower > -0.63528 )
							if( Negative_Money_Flow_Sum <= 2.10134e+07 )
								if( bearPower <= -0.439067 )
									ret := 0.306202
								if( bearPower > -0.439067 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 2.10134e+07 )
								if( bullPower <= 1.79492 )
									ret := 0.700000 // buy
								if( bullPower > 1.79492 )
									ret := -0.214286
				if( bearPower > -0.432659 )
					if( Negative_Money_Flow_Sum <= 4.50858e+06 )
						if( Typical_Price <= 75.8736 )
							if( bbp <= 1.10621 )
								if( Typical_Price <= 63.2387 )
									ret := 0.049546
								if( Typical_Price > 63.2387 )
									ret := 0.003096
							if( bbp > 1.10621 )
								if( Positive_Money_Flow_Sum <= 5.24204e+06 )
									ret := 0.109804
								if( Positive_Money_Flow_Sum > 5.24204e+06 )
									ret := -0.147607
						if( Typical_Price > 75.8736 )
							if( bbm <= 0.509334 )
								if( Positive_Money_Flow_Sum <= 1.94913e+07 )
									ret := 0.018856
								if( Positive_Money_Flow_Sum > 1.94913e+07 )
									ret := 0.413793
							if( bbm > 0.509334 )
								if( MFI_High <= -10.6192 )
									ret := 0.226586
								if( MFI_High > -10.6192 )
									ret := 0.088127
					if( Negative_Money_Flow_Sum > 4.50858e+06 )
						if( bearPower <= 2.86526 )
							if( Typical_Price <= 73.7025 )
								if( Positive_Money_Flow_Sum <= 3.34319e+07 )
									ret := 0.039039
								if( Positive_Money_Flow_Sum > 3.34319e+07 )
									ret := 0.485714
							if( Typical_Price > 73.7025 )
								if( Negative_Money_Flow_Sum <= 1.38111e+07 )
									ret := -0.062926
								if( Negative_Money_Flow_Sum > 1.38111e+07 )
									ret := 0.019620
						if( bearPower > 2.86526 )
							if( Positive_Money_Flow_Sum <= 6.25519e+07 )
								if( Typical_Price <= 193.576 )
									ret := 0.677419
								if( Typical_Price > 193.576 )
									ret := 0.151515
							if( Positive_Money_Flow_Sum > 6.25519e+07 )
								if( Positive_Money_Flow <= 8.26136e+06 )
									ret := -0.488889
								if( Positive_Money_Flow > 8.26136e+06 )
									ret := 0.221374
			if( Negative_Money_Flow_Sum > 2.63493e+07 )
				if( Positive_Money_Flow_Sum <= 6.94902e+07 )
					if( bbp <= 7.49054 )
						if( bullPower <= 2.363 )
							if( MFI_Low <= 29.4972 )
								if( Negative_Money_Flow_Sum <= 3.60532e+07 )
									ret := -0.308756
								if( Negative_Money_Flow_Sum > 3.60532e+07 )
									ret := -0.053381
							if( MFI_Low > 29.4972 )
								if( MFI <= 50.8056 )
									ret := 0.718750 // buy
								if( MFI > 50.8056 )
									ret := 0.016393
						if( bullPower > 2.363 )
							if( Positive_Money_Flow_Sum <= 4.69396e+07 )
								if( Money_Flow_Ratio <= 1.39314 )
									ret := -0.235075
								if( Money_Flow_Ratio > 1.39314 )
									ret := 0.277778
							if( Positive_Money_Flow_Sum > 4.69396e+07 )
								if( Typical_Price <= 248.479 )
									ret := -0.532710
								if( Typical_Price > 248.479 )
									ret := 0.176471
					if( bbp > 7.49054 )
						if( bbp <= 7.77681 )
							ret := 1.000000 // buy
						if( bbp > 7.77681 )
							if( bullPower <= 7.52262 )
								if( Positive_Money_Flow_Sum <= 3.5243e+07 )
									ret := 0.714286 // buy
								if( Positive_Money_Flow_Sum > 3.5243e+07 )
									ret := -0.190476
							if( bullPower > 7.52262 )
								if( bullPower <= 8.61263 )
									ret := 0.500000
								if( bullPower > 8.61263 )
									ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 6.94902e+07 )
					if( Positive_Money_Flow <= 7.79536e+06 )
						if( bullPower <= 2.55722 )
							if( BBPower_Color <= 0.5 )
								if( bbm <= 2.0922 )
									ret := -0.166667
								if( bbm > 2.0922 )
									ret := 0.777778 // buy
							if( BBPower_Color > 0.5 )
								if( Negative_Money_Flow_Sum <= 3.33229e+07 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 3.33229e+07 )
									ret := -0.134615
						if( bullPower > 2.55722 )
							if( Negative_Money_Flow_Sum <= 6.57784e+07 )
								if( bbm <= 1.925 )
									ret := -0.033333
								if( bbm > 1.925 )
									ret := 0.659751
							if( Negative_Money_Flow_Sum > 6.57784e+07 )
								if( bullPower <= 3.3489 )
									ret := 1.000000 // buy
								if( bullPower > 3.3489 )
									ret := -0.176471
					if( Positive_Money_Flow > 7.79536e+06 )
						if( bullPower <= 5.29889 )
							if( Negative_Money_Flow_Sum <= 5.27259e+07 )
								if( Negative_Money_Flow_Sum <= 3.76306e+07 )
									ret := -0.138889
								if( Negative_Money_Flow_Sum > 3.76306e+07 )
									ret := 0.600000
							if( Negative_Money_Flow_Sum > 5.27259e+07 )
								if( Negative_Money_Flow_Sum <= 6.8594e+07 )
									ret := -0.466667
								if( Negative_Money_Flow_Sum > 6.8594e+07 )
									ret := 0.239130
						if( bullPower > 5.29889 )
							if( Positive_Money_Flow <= 1.95197e+07 )
								if( bullPower <= 6.69283 )
									ret := -0.190083
								if( bullPower > 6.69283 )
									ret := -0.585106
							if( Positive_Money_Flow > 1.95197e+07 )
								if( bullPower <= 22.4396 )
									ret := 0.027907
								if( bullPower > 22.4396 )
									ret := -0.909091 // sell
		if( Negative_Money_Flow > 1.44382e+06 )
			if( MFI <= 40.5847 )
				if( MFI <= 38.0483 )
					if( Negative_Money_Flow <= 1.8436e+06 )
						if( Positive_Money_Flow_Sum <= 8.14798e+06 )
							if( Positive_Money_Flow_Sum <= 7.7444e+06 )
								if( bbm <= 0.922407 )
									ret := 0.111111
								if( bbm > 0.922407 )
									ret := -0.444444
							if( Positive_Money_Flow_Sum > 7.7444e+06 )
								ret := -0.857143 // sell
						if( Positive_Money_Flow_Sum > 8.14798e+06 )
							if( bbm <= 0.625 )
								if( bearPower <= -0.587617 )
									ret := -0.250000
								if( bearPower > -0.587617 )
									ret := 0.000000
							if( bbm > 0.625 )
								if( Typical_Price <= 182.57 )
									ret := 0.736842 // buy
								if( Typical_Price > 182.57 )
									ret := 0.000000
					if( Negative_Money_Flow > 1.8436e+06 )
						if( bbp <= -0.307207 )
							if( bbm <= 0.895 )
								if( MFI <= 36.8265 )
									ret := -0.255814
								if( MFI > 36.8265 )
									ret := 0.600000
							if( bbm > 0.895 )
								if( Typical_Price <= 103.318 )
									ret := -1.000000 // sell
								if( Typical_Price > 103.318 )
									ret := -0.750000 // sell
						if( bbp > -0.307207 )
							if( Positive_Money_Flow_Sum <= 1.56276e+07 )
								if( MFI_Low <= 8.9376 )
									ret := -0.200000
								if( MFI_Low > 8.9376 )
									ret := 0.309091
							if( Positive_Money_Flow_Sum > 1.56276e+07 )
								if( MFI <= 34.0871 )
									ret := -0.785714 // sell
								if( MFI > 34.0871 )
									ret := 0.000000
				if( MFI > 38.0483 )
					if( Positive_Money_Flow_Sum <= 8.77211e+06 )
						if( bearPower <= -0.663351 )
							if( Typical_Price <= 74.8848 )
								ret := 0.800000 // buy
							if( Typical_Price > 74.8848 )
								ret := 0.333333
						if( bearPower > -0.663351 )
							if( Negative_Money_Flow_Sum <= 4.44622e+06 )
								ret := 0.600000
							if( Negative_Money_Flow_Sum > 4.44622e+06 )
								if( Negative_Money_Flow_Sum <= 1.01451e+07 )
									ret := -0.375000
								if( Negative_Money_Flow_Sum > 1.01451e+07 )
									ret := 0.222222
					if( Positive_Money_Flow_Sum > 8.77211e+06 )
						if( Positive_Money_Flow_Sum <= 1.42093e+07 )
							if( Typical_Price <= 192.622 )
								if( MFI <= 39.9703 )
									ret := -0.972222 // sell
								if( MFI > 39.9703 )
									ret := -0.785714 // sell
							if( Typical_Price > 192.622 )
								ret := -0.250000
						if( Positive_Money_Flow_Sum > 1.42093e+07 )
							if( bbp <= 2.15871 )
								if( Money_Flow_Ratio <= 0.643484 )
									ret := -0.266667
								if( Money_Flow_Ratio > 0.643484 )
									ret := 0.590909
							if( bbp > 2.15871 )
								if( Raw_Money_Flow <= 6.37072e+06 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 6.37072e+06 )
									ret := -1.000000 // sell
			if( MFI > 40.5847 )
				if( MFI_Low <= 60.9325 )
					if( Negative_Money_Flow_Sum <= 6.57005e+06 )
						if( bullPower <= 2.38563 )
							if( Money_Flow_Ratio <= 1.38074 )
								if( Positive_Money_Flow_Sum <= 6.99047e+06 )
									ret := -0.112069
								if( Positive_Money_Flow_Sum > 6.99047e+06 )
									ret := -0.681818
							if( Money_Flow_Ratio > 1.38074 )
								if( bullPower <= 0.349296 )
									ret := 0.478261
								if( bullPower > 0.349296 )
									ret := 0.010638
						if( bullPower > 2.38563 )
							if( Negative_Money_Flow_Sum <= 5.72156e+06 )
								ret := -0.285714
							if( Negative_Money_Flow_Sum > 5.72156e+06 )
								if( bullPower <= 2.94846 )
									ret := -1.000000 // sell
								if( bullPower > 2.94846 )
									ret := -0.625000
					if( Negative_Money_Flow_Sum > 6.57005e+06 )
						if( bearPower <= 0.243517 )
							if( Positive_Money_Flow_Sum <= 6.00921e+07 )
								if( MFI_High <= -9.33989 )
									ret := 0.165626
								if( MFI_High > -9.33989 )
									ret := -0.090047
							if( Positive_Money_Flow_Sum > 6.00921e+07 )
								if( Raw_Money_Flow <= 5.95582e+06 )
									ret := 0.127660
								if( Raw_Money_Flow > 5.95582e+06 )
									ret := 0.497436
						if( bearPower > 0.243517 )
							if( Negative_Money_Flow <= 1.51686e+06 )
								if( bearPower <= 0.378666 )
									ret := 0.250000
								if( bearPower > 0.378666 )
									ret := 0.730769 // buy
							if( Negative_Money_Flow > 1.51686e+06 )
								if( Negative_Money_Flow_Sum <= 1.31961e+07 )
									ret := -0.082569
								if( Negative_Money_Flow_Sum > 1.31961e+07 )
									ret := 0.097212
				if( MFI_Low > 60.9325 )
					if( bbm <= 0.615 )
						if( Positive_Money_Flow_Sum <= 3.61223e+07 )
							if( Positive_Money_Flow_Sum <= 3.18458e+07 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 3.18458e+07 )
								ret := 0.500000
						if( Positive_Money_Flow_Sum > 3.61223e+07 )
							if( bullPower <= 1.46049 )
								ret := -0.750000 // sell
							if( bullPower > 1.46049 )
								ret := -0.500000
					if( bbm > 0.615 )
						if( Typical_Price <= 285.108 )
							if( Positive_Money_Flow_Sum <= 1.25125e+08 )
								if( bearPower <= 2.15747 )
									ret := 0.409836
								if( bearPower > 2.15747 )
									ret := 0.025641
							if( Positive_Money_Flow_Sum > 1.25125e+08 )
								if( Negative_Money_Flow <= 7.82907e+06 )
									ret := 0.954545 // buy
								if( Negative_Money_Flow > 7.82907e+06 )
									ret := 0.631579
						if( Typical_Price > 285.108 )
							if( Raw_Money_Flow <= 2.05031e+07 )
								if( Positive_Money_Flow <= 377575 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow > 377575 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 2.05031e+07 )
								if( Money_Flow_Ratio <= 6.40523 )
									ret := -0.142857
								if( Money_Flow_Ratio > 6.40523 )
									ret := 0.714286 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_LTCUSDT_30Min_60877c50(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


