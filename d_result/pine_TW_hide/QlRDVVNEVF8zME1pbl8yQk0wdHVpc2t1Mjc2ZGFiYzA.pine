//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: BTCUSDT_30Min_2BM0_276dabc0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_2BM0_276dabc0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_276dabc0(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bullPower <= 218.359 )
		if( Positive_Money_Flow_Sum <= 2.83787e+08 )
			if( Money_Flow_Ratio <= 0.326548 )
				if( bullPower <= 19.4512 )
					if( Positive_Money_Flow_Sum <= 7.64983e+07 )
						if( Raw_Money_Flow <= 1.14943e+07 )
							if( Positive_Money_Flow <= 6.85651e+06 )
								if( bullPower <= -1.56637 )
									ret := 0.082569
								if( bullPower > -1.56637 )
									ret := -0.150000
							if( Positive_Money_Flow > 6.85651e+06 )
								if( Typical_Price <= 23521.1 )
									ret := 0.739130 // buy
								if( Typical_Price > 23521.1 )
									ret := 0.142857
						if( Raw_Money_Flow > 1.14943e+07 )
							if( Raw_Money_Flow <= 2.13249e+07 )
								if( bbm <= 62.805 )
									ret := -0.125000
								if( bbm > 62.805 )
									ret := -0.513514
							if( Raw_Money_Flow > 2.13249e+07 )
								if( Negative_Money_Flow <= 3.15259e+07 )
									ret := -0.018116
								if( Negative_Money_Flow > 3.15259e+07 )
									ret := -0.270270
					if( Positive_Money_Flow_Sum > 7.64983e+07 )
						if( Raw_Money_Flow <= 7.90267e+07 )
							if( Typical_Price <= 57782.9 )
								if( Money_Flow_Ratio <= 0.310727 )
									ret := 0.080189
								if( Money_Flow_Ratio > 0.310727 )
									ret := -0.290323
							if( Typical_Price > 57782.9 )
								if( Negative_Money_Flow_Sum <= 4.477e+08 )
									ret := 0.027027
								if( Negative_Money_Flow_Sum > 4.477e+08 )
									ret := -0.333333
						if( Raw_Money_Flow > 7.90267e+07 )
							if( MFI_High <= -69.7439 )
								if( MFI_Low <= -10.4353 )
									ret := 0.013245
								if( MFI_Low > -10.4353 )
									ret := 0.717391 // buy
							if( MFI_High > -69.7439 )
								if( Raw_Money_Flow <= 1.36559e+08 )
									ret := -0.320042
								if( Raw_Money_Flow > 1.36559e+08 )
									ret := -0.073630
				if( bullPower > 19.4512 )
					if( bullPower <= 114.548 )
						if( Typical_Price <= 56607.2 )
							if( Positive_Money_Flow_Sum <= 9.49842e+07 )
								if( bbp <= -236.644 )
									ret := -0.875000 // sell
								if( bbp > -236.644 )
									ret := 0.284091
							if( Positive_Money_Flow_Sum > 9.49842e+07 )
								if( MFI <= 21.4999 )
									ret := 0.716981 // buy
								if( MFI > 21.4999 )
									ret := 0.353846
						if( Typical_Price > 56607.2 )
							if( Raw_Money_Flow <= 2.45423e+07 )
								if( Negative_Money_Flow <= 1.03276e+07 )
									ret := 0.250000
								if( Negative_Money_Flow > 1.03276e+07 )
									ret := 0.636364
							if( Raw_Money_Flow > 2.45423e+07 )
								if( MFI <= 23.3077 )
									ret := -0.482759
								if( MFI > 23.3077 )
									ret := 0.181818
					if( bullPower > 114.548 )
						if( Negative_Money_Flow <= 5.41739e+07 )
							if( MFI_Low <= -1.70467 )
								ret := -0.578947
							if( MFI_Low > -1.70467 )
								if( Positive_Money_Flow <= 3.4527e+07 )
									ret := 0.416667
								if( Positive_Money_Flow > 3.4527e+07 )
									ret := -0.363636
						if( Negative_Money_Flow > 5.41739e+07 )
							ret := -0.625000
			if( Money_Flow_Ratio > 0.326548 )
				if( Typical_Price <= 25634.4 )
					if( bearPower <= -377.352 )
						if( Negative_Money_Flow <= 1.19156e+08 )
							if( Negative_Money_Flow <= 3.18505e+07 )
								ret := -0.100000
							if( Negative_Money_Flow > 3.18505e+07 )
								if( bullPower <= -216.577 )
									ret := 1.000000 // buy
								if( bullPower > -216.577 )
									ret := 0.657143
						if( Negative_Money_Flow > 1.19156e+08 )
							ret := -0.153846
					if( bearPower > -377.352 )
						if( bbp <= -90.1897 )
							if( Raw_Money_Flow <= 3.52228e+07 )
								if( Negative_Money_Flow_Sum <= 4.8509e+08 )
									ret := -0.059524
								if( Negative_Money_Flow_Sum > 4.8509e+08 )
									ret := -0.923077 // sell
							if( Raw_Money_Flow > 3.52228e+07 )
								if( MFI_Low <= 28.3237 )
									ret := 0.166667
								if( MFI_Low > 28.3237 )
									ret := -0.640000
						if( bbp > -90.1897 )
							if( Typical_Price <= 19716.4 )
								if( MFI_High <= -54.1461 )
									ret := -0.571429
								if( MFI_High > -54.1461 )
									ret := 0.064851
							if( Typical_Price > 19716.4 )
								if( bbm <= 124.494 )
									ret := 0.191283
								if( bbm > 124.494 )
									ret := 0.395181
				if( Typical_Price > 25634.4 )
					if( bbm <= 244.078 )
						if( bearPower <= -55.2317 )
							if( MFI_High <= -25.0641 )
								if( Negative_Money_Flow_Sum <= 3.43409e+08 )
									ret := -0.099842
								if( Negative_Money_Flow_Sum > 3.43409e+08 )
									ret := 0.035932
							if( MFI_High > -25.0641 )
								if( Negative_Money_Flow <= 3.60618e+07 )
									ret := 0.024893
								if( Negative_Money_Flow > 3.60618e+07 )
									ret := 0.440678
						if( bearPower > -55.2317 )
							if( MFI_Low <= 53.2219 )
								if( Positive_Money_Flow_Sum <= 2.40329e+08 )
									ret := 0.034031
								if( Positive_Money_Flow_Sum > 2.40329e+08 )
									ret := -0.173459
							if( MFI_Low > 53.2219 )
								if( MFI_High <= -6.43918 )
									ret := -0.571429
								if( MFI_High > -6.43918 )
									ret := -0.142857
					if( bbm > 244.078 )
						if( Positive_Money_Flow <= 4.54211e+07 )
							if( Negative_Money_Flow <= 1.12001e+08 )
								if( MFI <= 36.1216 )
									ret := 0.186701
								if( MFI > 36.1216 )
									ret := 0.038198
							if( Negative_Money_Flow > 1.12001e+08 )
								if( MFI <= 24.8269 )
									ret := 1.000000 // buy
								if( MFI > 24.8269 )
									ret := -0.337017
						if( Positive_Money_Flow > 4.54211e+07 )
							if( Negative_Money_Flow_Sum <= 5.03639e+08 )
								if( MFI_Low <= 15.4132 )
									ret := -0.464968
								if( MFI_Low > 15.4132 )
									ret := -0.076696
							if( Negative_Money_Flow_Sum > 5.03639e+08 )
								if( bullPower <= -186.255 )
									ret := 0.381579
								if( bullPower > -186.255 )
									ret := -0.122449
		if( Positive_Money_Flow_Sum > 2.83787e+08 )
			if( Money_Flow_Ratio <= 2.46922 )
				if( Raw_Money_Flow <= 3.14167e+08 )
					if( Positive_Money_Flow_Sum <= 3.4389e+08 )
						if( bearPower <= -560.372 )
							if( Money_Flow_Ratio <= 1.46747 )
								if( Money_Flow_Ratio <= 0.209165 )
									ret := -0.189655
								if( Money_Flow_Ratio > 0.209165 )
									ret := 0.423333
							if( Money_Flow_Ratio > 1.46747 )
								ret := -1.000000 // sell
						if( bearPower > -560.372 )
							if( Positive_Money_Flow <= 4.1234e+07 )
								if( bbm <= 426.033 )
									ret := 0.073829
								if( bbm > 426.033 )
									ret := 0.449640
							if( Positive_Money_Flow > 4.1234e+07 )
								if( Positive_Money_Flow_Sum <= 2.8688e+08 )
									ret := 0.318182
								if( Positive_Money_Flow_Sum > 2.8688e+08 )
									ret := -0.188022
					if( Positive_Money_Flow_Sum > 3.4389e+08 )
						if( Money_Flow_Ratio <= 0.259018 )
							if( Raw_Money_Flow <= 1.68607e+08 )
								if( bearPower <= -979.141 )
									ret := 0.519231
								if( bearPower > -979.141 )
									ret := -0.162791
							if( Raw_Money_Flow > 1.68607e+08 )
								if( MFI <= 17.2639 )
									ret := 0.172414
								if( MFI > 17.2639 )
									ret := 0.707317 // buy
						if( Money_Flow_Ratio > 0.259018 )
							if( MFI_High <= -54.5596 )
								if( bullPower <= -955.05 )
									ret := 0.411765
								if( bullPower > -955.05 )
									ret := -0.157285
							if( MFI_High > -54.5596 )
								if( bbp <= -173.719 )
									ret := 0.048703
								if( bbp > -173.719 )
									ret := -0.013460
				if( Raw_Money_Flow > 3.14167e+08 )
					if( bullPower <= -404.938 )
						if( Money_Flow_Ratio <= 0.254045 )
							if( Negative_Money_Flow_Sum <= 2.5717e+09 )
								if( Typical_Price <= 40981.2 )
									ret := 1.000000 // buy
								if( Typical_Price > 40981.2 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 2.5717e+09 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.254045 )
							if( MFI <= 24.961 )
								if( MFI_High <= -57.4656 )
									ret := 0.555556
								if( MFI_High > -57.4656 )
									ret := -0.230769
							if( MFI > 24.961 )
								if( MFI <= 32.0315 )
									ret := 0.896552 // buy
								if( MFI > 32.0315 )
									ret := 0.375000
					if( bullPower > -404.938 )
						if( bbm <= 1904.02 )
							if( Positive_Money_Flow_Sum <= 7.16343e+08 )
								if( bearPower <= -382.409 )
									ret := 0.446154
								if( bearPower > -382.409 )
									ret := 0.882353 // buy
							if( Positive_Money_Flow_Sum > 7.16343e+08 )
								if( Negative_Money_Flow_Sum <= 2.3882e+09 )
									ret := 0.198157
								if( Negative_Money_Flow_Sum > 2.3882e+09 )
									ret := -0.270270
						if( bbm > 1904.02 )
							if( Negative_Money_Flow_Sum <= 1.79146e+09 )
								ret := -0.578947
							if( Negative_Money_Flow_Sum > 1.79146e+09 )
								ret := 0.066667
			if( Money_Flow_Ratio > 2.46922 )
				if( Money_Flow_Ratio <= 4.65834 )
					if( MFI_Low <= 55.9365 )
						if( Typical_Price <= 49003.7 )
							if( MFI_High <= -4.44083 )
								if( Negative_Money_Flow_Sum <= 6.15688e+08 )
									ret := 0.258065
								if( Negative_Money_Flow_Sum > 6.15688e+08 )
									ret := 0.653333
							if( MFI_High > -4.44083 )
								if( MFI_High <= -4.30326 )
									ret := -0.476190
								if( MFI_High > -4.30326 )
									ret := 0.026316
						if( Typical_Price > 49003.7 )
							if( Negative_Money_Flow <= 3.5429e+07 )
								if( Negative_Money_Flow_Sum <= 1.41351e+08 )
									ret := -0.142857
								if( Negative_Money_Flow_Sum > 1.41351e+08 )
									ret := -0.678571
							if( Negative_Money_Flow > 3.5429e+07 )
								ret := 0.666667
					if( MFI_Low > 55.9365 )
						if( bullPower <= 181.708 )
							if( Positive_Money_Flow <= 9.28836e+06 )
								if( bearPower <= -34.5361 )
									ret := -0.041667
								if( bearPower > -34.5361 )
									ret := 0.720779 // buy
							if( Positive_Money_Flow > 9.28836e+06 )
								if( bearPower <= -1.11641 )
									ret := 0.605634
								if( bearPower > -1.11641 )
									ret := 0.226950
						if( bullPower > 181.708 )
							if( bbp <= 260.846 )
								if( bullPower <= 200.239 )
									ret := -0.666667
								if( bullPower > 200.239 )
									ret := 0.160000
							if( bbp > 260.846 )
								if( Positive_Money_Flow_Sum <= 3.30967e+08 )
									ret := -0.636364
								if( Positive_Money_Flow_Sum > 3.30967e+08 )
									ret := 0.700000 // buy
				if( Money_Flow_Ratio > 4.65834 )
					if( Negative_Money_Flow_Sum <= 8.40662e+07 )
						if( Negative_Money_Flow_Sum <= 7.372e+07 )
							if( Positive_Money_Flow_Sum <= 3.07423e+08 )
								if( Raw_Money_Flow <= 3.46062e+07 )
									ret := -0.400000
								if( Raw_Money_Flow > 3.46062e+07 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.07423e+08 )
								if( Typical_Price <= 22800.8 )
									ret := -0.263158
								if( Typical_Price > 22800.8 )
									ret := 0.522727
						if( Negative_Money_Flow_Sum > 7.372e+07 )
							if( Typical_Price <= 29489 )
								ret := 0.888889 // buy
							if( Typical_Price > 29489 )
								ret := 0.500000
					if( Negative_Money_Flow_Sum > 8.40662e+07 )
						if( MFI <= 85.3017 )
							if( Typical_Price <= 21188.9 )
								if( Raw_Money_Flow <= 3.14575e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 3.14575e+07 )
									ret := -0.272727
							if( Typical_Price > 21188.9 )
								if( bearPower <= 64.455 )
									ret := -0.346154
								if( bearPower > 64.455 )
									ret := 0.277778
						if( MFI > 85.3017 )
							if( bullPower <= 157.107 )
								ret := 0.111111
							if( bullPower > 157.107 )
								ret := -0.062500
	if( bullPower > 218.359 )
		if( MFI_Low <= 50.4897 )
			if( Money_Flow_Ratio <= 2.02816 )
				if( Positive_Money_Flow <= 7.71827e+07 )
					if( bullPower <= 389.572 )
						if( bbm <= 1343.27 )
							if( Typical_Price <= 22805.9 )
								if( MFI_Low <= 31.9667 )
									ret := -0.615385
								if( MFI_Low > 31.9667 )
									ret := -0.103774
							if( Typical_Price > 22805.9 )
								if( MFI <= 65.3361 )
									ret := -0.080527
								if( MFI > 65.3361 )
									ret := 0.046693
						if( bbm > 1343.27 )
							if( MFI_Low <= 27.768 )
								ret := 0.882353 // buy
							if( MFI_Low > 27.768 )
								ret := 0.666667
					if( bullPower > 389.572 )
						if( MFI_High <= -28.0473 )
							if( MFI <= 38.1516 )
								if( bbm <= 934.088 )
									ret := 0.070423
								if( bbm > 934.088 )
									ret := 0.815789 // buy
							if( MFI > 38.1516 )
								if( bbp <= 88.7987 )
									ret := 0.333333
								if( bbp > 88.7987 )
									ret := -0.137607
						if( MFI_High > -28.0473 )
							if( Negative_Money_Flow_Sum <= 1.03915e+09 )
								if( Negative_Money_Flow_Sum <= 4.66784e+08 )
									ret := 0.006667
								if( Negative_Money_Flow_Sum > 4.66784e+08 )
									ret := 0.210093
							if( Negative_Money_Flow_Sum > 1.03915e+09 )
								if( Typical_Price <= 47416.9 )
									ret := -0.244444
								if( Typical_Price > 47416.9 )
									ret := -0.900000 // sell
				if( Positive_Money_Flow > 7.71827e+07 )
					if( Negative_Money_Flow_Sum <= 2.02896e+08 )
						if( Negative_Money_Flow_Sum <= 1.46871e+08 )
							if( MFI <= 63.5978 )
								ret := 0.076923
							if( MFI > 63.5978 )
								ret := -0.583333
						if( Negative_Money_Flow_Sum > 1.46871e+08 )
							if( bearPower <= 73.5619 )
								if( Positive_Money_Flow_Sum <= 2.86613e+08 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow_Sum > 2.86613e+08 )
									ret := -1.000000 // sell
							if( bearPower > 73.5619 )
								if( Positive_Money_Flow_Sum <= 3.29545e+08 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 3.29545e+08 )
									ret := -0.636364
					if( Negative_Money_Flow_Sum > 2.02896e+08 )
						if( MFI_High <= -24.4708 )
							if( bullPower <= 276.199 )
								if( Positive_Money_Flow <= 1.97697e+08 )
									ret := 0.010256
								if( Positive_Money_Flow > 1.97697e+08 )
									ret := 0.566667
							if( bullPower > 276.199 )
								if( MFI_Low <= 19.3764 )
									ret := -0.062257
								if( MFI_Low > 19.3764 )
									ret := -0.265241
						if( MFI_High > -24.4708 )
							if( Positive_Money_Flow <= 9.16566e+07 )
								if( MFI_Low <= 35.9457 )
									ret := 0.812500 // buy
								if( MFI_Low > 35.9457 )
									ret := -0.342380
							if( Positive_Money_Flow > 9.16566e+07 )
								if( Positive_Money_Flow_Sum <= 7.95887e+08 )
									ret := 0.320127
								if( Positive_Money_Flow_Sum > 7.95887e+08 )
									ret := -0.233743
			if( Money_Flow_Ratio > 2.02816 )
				if( Negative_Money_Flow_Sum <= 8.18933e+08 )
					if( Positive_Money_Flow_Sum <= 8.61021e+08 )
						if( Positive_Money_Flow <= 2.48447e+07 )
							if( Negative_Money_Flow <= 1.75335e+07 )
								if( Negative_Money_Flow_Sum <= 1.84126e+08 )
									ret := -0.007812
								if( Negative_Money_Flow_Sum > 1.84126e+08 )
									ret := 0.763889 // buy
							if( Negative_Money_Flow > 1.75335e+07 )
								if( bullPower <= 662.065 )
									ret := -0.168919
								if( bullPower > 662.065 )
									ret := 0.410000
						if( Positive_Money_Flow > 2.48447e+07 )
							if( MFI_Low <= 49.7456 )
								if( bbp <= 1345.96 )
									ret := -0.183597
								if( bbp > 1345.96 )
									ret := -0.694915
							if( MFI_Low > 49.7456 )
								if( Negative_Money_Flow_Sum <= 3.30596e+08 )
									ret := -0.078067
								if( Negative_Money_Flow_Sum > 3.30596e+08 )
									ret := 0.814815 // buy
					if( Positive_Money_Flow_Sum > 8.61021e+08 )
						if( BBPower_Color <= 0.5 )
							if( MFI <= 68.4836 )
								ret := 0.700000 // buy
							if( MFI > 68.4836 )
								if( Positive_Money_Flow <= 3.78521e+07 )
									ret := -0.230769
								if( Positive_Money_Flow > 3.78521e+07 )
									ret := 0.818182 // buy
						if( BBPower_Color > 0.5 )
							if( MFI <= 67.0837 )
								ret := -1.000000 // sell
							if( MFI > 67.0837 )
								if( Negative_Money_Flow <= 1.78734e+08 )
									ret := -0.403433
								if( Negative_Money_Flow > 1.78734e+08 )
									ret := 0.368421
				if( Negative_Money_Flow_Sum > 8.18933e+08 )
					if( bullPower <= 603.705 )
						if( bbm <= 228.945 )
							if( Raw_Money_Flow <= 2.51003e+08 )
								if( bearPower <= 187.392 )
									ret := 0.217391
								if( bearPower > 187.392 )
									ret := 0.818182 // buy
							if( Raw_Money_Flow > 2.51003e+08 )
								ret := 1.000000 // buy
						if( bbm > 228.945 )
							if( Raw_Money_Flow <= 2.68579e+08 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 2.68579e+08 )
								if( MFI_Low <= 49.0954 )
									ret := 0.928571 // buy
								if( MFI_Low > 49.0954 )
									ret := 0.000000
					if( bullPower > 603.705 )
						ret := -0.909091 // sell
		if( MFI_Low > 50.4897 )
			if( bbp <= 1745.82 )
				if( Positive_Money_Flow_Sum <= 4.13034e+09 )
					if( Negative_Money_Flow_Sum <= 5.24539e+08 )
						if( MFI_Low <= 51.5724 )
							if( bbm <= 197.145 )
								if( Positive_Money_Flow <= 4.32352e+07 )
									ret := -0.052083
								if( Positive_Money_Flow > 4.32352e+07 )
									ret := -0.689655
							if( bbm > 197.145 )
								if( bearPower <= 357.33 )
									ret := 0.355828
								if( bearPower > 357.33 )
									ret := -0.011236
						if( MFI_Low > 51.5724 )
							if( MFI_High <= -2.68004 )
								if( Money_Flow_Ratio <= 2.75862 )
									ret := 0.057899
								if( Money_Flow_Ratio > 2.75862 )
									ret := -0.118586
							if( MFI_High > -2.68004 )
								if( MFI <= 78.6476 )
									ret := 0.286525
								if( MFI > 78.6476 )
									ret := 0.020380
					if( Negative_Money_Flow_Sum > 5.24539e+08 )
						if( bbp <= 690.7 )
							if( Negative_Money_Flow_Sum <= 5.58915e+08 )
								if( Positive_Money_Flow <= 5.81995e+07 )
									ret := 0.600000
								if( Positive_Money_Flow > 5.81995e+07 )
									ret := 0.947368 // buy
							if( Negative_Money_Flow_Sum > 5.58915e+08 )
								if( MFI_High <= -8.93371 )
									ret := -0.714286 // sell
								if( MFI_High > -8.93371 )
									ret := 0.404624
						if( bbp > 690.7 )
							if( Raw_Money_Flow <= 1.62899e+08 )
								if( bullPower <= 581.275 )
									ret := -0.066667
								if( bullPower > 581.275 )
									ret := 0.770833 // buy
							if( Raw_Money_Flow > 1.62899e+08 )
								if( MFI <= 81.7499 )
									ret := -0.379310
								if( MFI > 81.7499 )
									ret := 0.114286
				if( Positive_Money_Flow_Sum > 4.13034e+09 )
					if( Money_Flow_Ratio <= 4.5542 )
						if( Negative_Money_Flow_Sum <= 1.52084e+09 )
							if( bullPower <= 434.739 )
								ret := -0.888889 // sell
							if( bullPower > 434.739 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.52084e+09 )
							ret := -0.571429
					if( Money_Flow_Ratio > 4.5542 )
						ret := -0.285714
			if( bbp > 1745.82 )
				if( Positive_Money_Flow_Sum <= 2.63605e+09 )
					if( Money_Flow_Ratio <= 2.80696 )
						if( Money_Flow_Ratio <= 2.48595 )
							ret := 0.750000 // buy
						if( Money_Flow_Ratio > 2.48595 )
							if( Positive_Money_Flow <= 1.90382e+08 )
								if( Money_Flow_Ratio <= 2.67267 )
									ret := -0.454545
								if( Money_Flow_Ratio > 2.67267 )
									ret := -0.888889 // sell
							if( Positive_Money_Flow > 1.90382e+08 )
								if( bearPower <= 786.288 )
									ret := 1.000000 // buy
								if( bearPower > 786.288 )
									ret := -0.538462
					if( Money_Flow_Ratio > 2.80696 )
						if( Negative_Money_Flow_Sum <= 1.81486e+08 )
							if( bbm <= 1342.85 )
								if( Typical_Price <= 55489.9 )
									ret := 0.077381
								if( Typical_Price > 55489.9 )
									ret := -0.414815
							if( bbm > 1342.85 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.81486e+08 )
							if( Positive_Money_Flow_Sum <= 1.12213e+09 )
								if( bearPower <= 679.178 )
									ret := 0.818182 // buy
								if( bearPower > 679.178 )
									ret := 0.471429
							if( Positive_Money_Flow_Sum > 1.12213e+09 )
								if( bearPower <= 501.34 )
									ret := -0.411765
								if( bearPower > 501.34 )
									ret := 0.357466
				if( Positive_Money_Flow_Sum > 2.63605e+09 )
					if( Positive_Money_Flow <= 2.21733e+08 )
						ret := -1.000000 // sell
					if( Positive_Money_Flow > 2.21733e+08 )
						ret := -0.500000
	
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
float op_operation = decision_tree_0_BTCUSDT_30Min_276dabc0(bullPower, bbp, bearPower, bbm, BBPower_Color, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


