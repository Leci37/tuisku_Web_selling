//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: RIVN_5Min_2MT0_c77295a6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_2MT0_c77295a6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_c77295a6(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 95.6488 )
		if( Negative_Money_Flow_Sum <= 1.53034e+06 )
			if( Typical_Price <= 22.2967 )
				if( ema12 <= 0.032084 )
					if( Positive_Money_Flow_Sum <= 350814 )
						if( Negative_Money_Flow_Sum <= 377380 )
							if( ema13 <= 0.011559 )
								if( Positive_Money_Flow_Sum <= 343745 )
									ret := -0.051646
								if( Positive_Money_Flow_Sum > 343745 )
									ret := 0.555556
							if( ema13 > 0.011559 )
								if( Typical_Price <= 13.9033 )
									ret := -0.214467
								if( Typical_Price > 13.9033 )
									ret := -0.036313
						if( Negative_Money_Flow_Sum > 377380 )
							if( Negative_Money_Flow_Sum <= 551034 )
								if( ema2 <= 20.964 )
									ret := 0.148748
								if( ema2 > 20.964 )
									ret := 0.689655
							if( Negative_Money_Flow_Sum > 551034 )
								if( Raw_Money_Flow <= 26731.1 )
									ret := -0.195906
								if( Raw_Money_Flow > 26731.1 )
									ret := 0.052764
					if( Positive_Money_Flow_Sum > 350814 )
						if( Money_Flow_Ratio <= 0.966586 )
							if( Negative_Money_Flow_Sum <= 1.20478e+06 )
								if( MFI <= 44.5797 )
									ret := -0.067717
								if( MFI > 44.5797 )
									ret := -0.311321
							if( Negative_Money_Flow_Sum > 1.20478e+06 )
								if( ema12 <= -0.006223 )
									ret := -0.549383
								if( ema12 > -0.006223 )
									ret := -0.206061
						if( Money_Flow_Ratio > 0.966586 )
							if( Positive_Money_Flow <= 1.3584e+07 )
								if( Money_Flow_Ratio <= 5.61613 )
									ret := -0.105033
								if( Money_Flow_Ratio > 5.61613 )
									ret := 0.006776
							if( Positive_Money_Flow > 1.3584e+07 )
								if( Money_Flow_Ratio <= 17.1209 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 17.1209 )
									ret := -0.444444
				if( ema12 > 0.032084 )
					if( MFI <= 97.3378 )
						if( Negative_Money_Flow_Sum <= 246102 )
							if( Positive_Money_Flow <= 92430.4 )
								if( ema1 <= 13.9108 )
									ret := -0.062500
								if( ema1 > 13.9108 )
									ret := -0.348361
							if( Positive_Money_Flow > 92430.4 )
								if( ema3 <= 16.231 )
									ret := -0.472727
								if( ema3 > 16.231 )
									ret := -0.935065 // sell
						if( Negative_Money_Flow_Sum > 246102 )
							if( MFI <= 96.9925 )
								if( Positive_Money_Flow_Sum <= 2.32865e+07 )
									ret := -0.175714
								if( Positive_Money_Flow_Sum > 2.32865e+07 )
									ret := 0.666667
							if( MFI > 96.9925 )
								if( Negative_Money_Flow_Sum <= 1.24835e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.24835e+06 )
									ret := -0.727273 // sell
					if( MFI > 97.3378 )
						if( Raw_Money_Flow <= 9.10334e+06 )
							if( ema13 <= 0.127717 )
								if( ema13 <= 0.077161 )
									ret := -0.307692
								if( ema13 > 0.077161 )
									ret := 0.666667
							if( ema13 > 0.127717 )
								if( ema2 <= 10.5785 )
									ret := -0.181818
								if( ema2 > 10.5785 )
									ret := -0.818182 // sell
						if( Raw_Money_Flow > 9.10334e+06 )
							if( ema3 <= 15.6867 )
								if( ema2 <= 13.6737 )
									ret := -0.045455
								if( ema2 > 13.6737 )
									ret := 0.661765
							if( ema3 > 15.6867 )
								ret := -0.615385
			if( Typical_Price > 22.2967 )
				if( ema3 <= 22.4824 )
					if( ema1 <= 22.4523 )
						if( ema12 <= 0.007025 )
							if( Negative_Money_Flow_Sum <= 735814 )
								ret := 0.888889 // buy
							if( Negative_Money_Flow_Sum > 735814 )
								ret := 0.230769
						if( ema12 > 0.007025 )
							if( ema2 <= 22.3881 )
								if( MFI_Low <= 69.3236 )
									ret := -0.031250
								if( MFI_Low > 69.3236 )
									ret := 0.400000
							if( ema2 > 22.3881 )
								ret := -0.785714 // sell
					if( ema1 > 22.4523 )
						if( Typical_Price <= 22.5734 )
							if( ema13 <= 0.018085 )
								ret := 0.727273 // buy
							if( ema13 > 0.018085 )
								ret := 0.952381 // buy
						if( Typical_Price > 22.5734 )
							ret := -0.100000
				if( ema3 > 22.4824 )
					if( Typical_Price <= 24.7675 )
						if( Positive_Money_Flow <= 531849 )
							if( Positive_Money_Flow_Sum <= 1.92637e+06 )
								if( Positive_Money_Flow_Sum <= 1.3933e+06 )
									ret := -0.013333
								if( Positive_Money_Flow_Sum > 1.3933e+06 )
									ret := 0.466667
							if( Positive_Money_Flow_Sum > 1.92637e+06 )
								if( ema2 <= 24.4056 )
									ret := -0.295775
								if( ema2 > 24.4056 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow > 531849 )
							if( Typical_Price <= 23.4019 )
								ret := -0.125000
							if( Typical_Price > 23.4019 )
								if( Negative_Money_Flow_Sum <= 934297 )
									ret := -0.312500
								if( Negative_Money_Flow_Sum > 934297 )
									ret := -0.764706 // sell
					if( Typical_Price > 24.7675 )
						if( ema13 <= 0.183643 )
							if( Negative_Money_Flow_Sum <= 575442 )
								if( tema <= 24.8792 )
									ret := 1.000000 // buy
								if( tema > 24.8792 )
									ret := 0.321429
							if( Negative_Money_Flow_Sum > 575442 )
								if( Positive_Money_Flow_Sum <= 297170 )
									ret := -0.642857
								if( Positive_Money_Flow_Sum > 297170 )
									ret := 0.021739
						if( ema13 > 0.183643 )
							ret := -0.809524 // sell
		if( Negative_Money_Flow_Sum > 1.53034e+06 )
			if( tema <= 25.6019 )
				if( Negative_Money_Flow_Sum <= 1.13409e+08 )
					if( MFI_Low <= 65.4526 )
						if( ema12 <= 0.101526 )
							if( Positive_Money_Flow <= 9.04767e+06 )
								if( ema12 <= 0.016378 )
									ret := -0.014764
								if( ema12 > 0.016378 )
									ret := 0.059237
							if( Positive_Money_Flow > 9.04767e+06 )
								if( ema12 <= -0.052697 )
									ret := 0.071960
								if( ema12 > -0.052697 )
									ret := -0.194906
						if( ema12 > 0.101526 )
							if( Positive_Money_Flow_Sum <= 3.53784e+07 )
								if( Positive_Money_Flow_Sum <= 3.10181e+07 )
									ret := 0.215190
								if( Positive_Money_Flow_Sum > 3.10181e+07 )
									ret := 0.933333 // buy
							if( Positive_Money_Flow_Sum > 3.53784e+07 )
								if( ema13 <= 0.162555 )
									ret := 0.218750
								if( ema13 > 0.162555 )
									ret := -0.309623
					if( MFI_Low > 65.4526 )
						if( Typical_Price <= 15.7808 )
							if( ema12 <= 0.064483 )
								if( Raw_Money_Flow <= 1.29789e+07 )
									ret := 0.402214
								if( Raw_Money_Flow > 1.29789e+07 )
									ret := -0.159420
							if( ema12 > 0.064483 )
								if( MFI_High <= 11.6216 )
									ret := -0.110368
								if( MFI_High > 11.6216 )
									ret := -0.511111
						if( Typical_Price > 15.7808 )
							if( tema <= 16.1916 )
								if( ema3 <= 15.9704 )
									ret := 0.493151
								if( ema3 > 15.9704 )
									ret := 1.000000 // buy
							if( tema > 16.1916 )
								if( Positive_Money_Flow_Sum <= 4.82467e+08 )
									ret := 0.235616
								if( Positive_Money_Flow_Sum > 4.82467e+08 )
									ret := -0.681818
				if( Negative_Money_Flow_Sum > 1.13409e+08 )
					if( MFI_Low <= 8.22117 )
						if( Raw_Money_Flow <= 1.05395e+07 )
							if( Money_Flow_Ratio <= 0.287954 )
								if( ema2 <= 19.2489 )
									ret := 0.630435
								if( ema2 > 19.2489 )
									ret := -0.208333
							if( Money_Flow_Ratio > 0.287954 )
								if( Positive_Money_Flow <= 9.16962e+06 )
									ret := -0.428571
								if( Positive_Money_Flow > 9.16962e+06 )
									ret := 0.300000
						if( Raw_Money_Flow > 1.05395e+07 )
							if( Typical_Price <= 16.095 )
								if( ema13 <= -0.208083 )
									ret := -0.929577 // sell
								if( ema13 > -0.208083 )
									ret := -0.538462
							if( Typical_Price > 16.095 )
								if( ema12 <= -0.108053 )
									ret := -0.285714
								if( ema12 > -0.108053 )
									ret := 0.487805
					if( MFI_Low > 8.22117 )
						if( tema <= 17.8018 )
							if( ema2 <= 13.7401 )
								if( Typical_Price <= 13.5432 )
									ret := 0.271186
								if( Typical_Price > 13.5432 )
									ret := 0.947368 // buy
							if( ema2 > 13.7401 )
								if( ema13 <= -0.410389 )
									ret := 0.700000 // buy
								if( ema13 > -0.410389 )
									ret := -0.114362
						if( tema > 17.8018 )
							if( ema13 <= -0.745158 )
								ret := -0.833333 // sell
							if( ema13 > -0.745158 )
								if( Positive_Money_Flow_Sum <= 6.36037e+08 )
									ret := 0.307339
								if( Positive_Money_Flow_Sum > 6.36037e+08 )
									ret := 0.928571 // buy
			if( tema > 25.6019 )
				if( Negative_Money_Flow_Sum <= 9.21334e+07 )
					if( ema12 <= 0.134824 )
						if( MFI <= 68.1205 )
							if( ema3 <= 26.237 )
								if( Typical_Price <= 26.1465 )
									ret := -0.256579
								if( Typical_Price > 26.1465 )
									ret := -0.928571 // sell
							if( ema3 > 26.237 )
								if( Positive_Money_Flow_Sum <= 5.19238e+07 )
									ret := -0.235294
								if( Positive_Money_Flow_Sum > 5.19238e+07 )
									ret := 0.215190
						if( MFI > 68.1205 )
							if( tema <= 26.5414 )
								if( Negative_Money_Flow_Sum <= 2.81534e+07 )
									ret := 0.214286
								if( Negative_Money_Flow_Sum > 2.81534e+07 )
									ret := 0.660377
							if( tema > 26.5414 )
								if( Typical_Price <= 26.7775 )
									ret := -0.840000 // sell
								if( Typical_Price > 26.7775 )
									ret := 0.266667
					if( ema12 > 0.134824 )
						if( MFI <= 94.6497 )
							if( MFI_Low <= 55.7341 )
								ret := -0.181818
							if( MFI_Low > 55.7341 )
								if( ema13 <= 0.291432 )
									ret := -0.476190
								if( ema13 > 0.291432 )
									ret := -0.875000 // sell
						if( MFI > 94.6497 )
							ret := 0.777778 // buy
				if( Negative_Money_Flow_Sum > 9.21334e+07 )
					if( Negative_Money_Flow_Sum <= 1.7908e+08 )
						if( ema3 <= 25.6133 )
							ret := -1.000000 // sell
						if( ema3 > 25.6133 )
							if( Positive_Money_Flow <= 2.90488e+07 )
								if( ema1 <= 25.907 )
									ret := -0.421053
								if( ema1 > 25.907 )
									ret := -0.719512 // sell
							if( Positive_Money_Flow > 2.90488e+07 )
								ret := 0.062500
					if( Negative_Money_Flow_Sum > 1.7908e+08 )
						if( MFI <= 37.5186 )
							if( Raw_Money_Flow <= 1.45869e+07 )
								ret := -0.071429
							if( Raw_Money_Flow > 1.45869e+07 )
								if( ema3 <= 26.6937 )
									ret := -1.000000 // sell
								if( ema3 > 26.6937 )
									ret := -0.636364
						if( MFI > 37.5186 )
							if( MFI <= 44.4099 )
								ret := 0.666667
							if( MFI > 44.4099 )
								if( ema12 <= 0.02586 )
									ret := 0.250000
								if( ema12 > 0.02586 )
									ret := -0.066667
	if( Negative_Money_Flow > 95.6488 )
		if( Negative_Money_Flow_Sum <= 1.02627e+06 )
			if( Typical_Price <= 16.8869 )
				if( ema12 <= -0.009788 )
					if( MFI <= 61.7917 )
						if( ema2 <= 15.4675 )
							if( Negative_Money_Flow <= 283737 )
								if( Negative_Money_Flow_Sum <= 921476 )
									ret := 0.366207
								if( Negative_Money_Flow_Sum > 921476 )
									ret := -0.104167
							if( Negative_Money_Flow > 283737 )
								if( ema3 <= 10.946 )
									ret := -0.071429
								if( ema3 > 10.946 )
									ret := 0.983051 // buy
						if( ema2 > 15.4675 )
							if( ema3 <= 15.5742 )
								if( Negative_Money_Flow_Sum <= 315356 )
									ret := -0.875000 // sell
								if( Negative_Money_Flow_Sum > 315356 )
									ret := -0.055556
							if( ema3 > 15.5742 )
								if( Raw_Money_Flow <= 113001 )
									ret := 0.318367
								if( Raw_Money_Flow > 113001 )
									ret := -0.071429
					if( MFI > 61.7917 )
						if( Typical_Price <= 13.6363 )
							if( MFI_Low <= 47.553 )
								if( MFI_Low <= 43.3944 )
									ret := -0.300000
								if( MFI_Low > 43.3944 )
									ret := 0.187500
							if( MFI_Low > 47.553 )
								if( ema13 <= -0.021958 )
									ret := -0.829268 // sell
								if( ema13 > -0.021958 )
									ret := -0.250000
						if( Typical_Price > 13.6363 )
							if( Negative_Money_Flow <= 75397.8 )
								if( ema13 <= -0.070621 )
									ret := 1.000000 // buy
								if( ema13 > -0.070621 )
									ret := 0.200000
							if( Negative_Money_Flow > 75397.8 )
								if( Raw_Money_Flow <= 100282 )
									ret := -0.583333
								if( Raw_Money_Flow > 100282 )
									ret := 0.055556
				if( ema12 > -0.009788 )
					if( Money_Flow_Ratio <= 0.704029 )
						if( Negative_Money_Flow_Sum <= 563779 )
							if( ema12 <= 0.003605 )
								if( Positive_Money_Flow <= 2624.54 )
									ret := 0.045579
								if( Positive_Money_Flow > 2624.54 )
									ret := -0.777778 // sell
							if( ema12 > 0.003605 )
								if( Positive_Money_Flow <= 42.7122 )
									ret := -0.076531
								if( Positive_Money_Flow > 42.7122 )
									ret := -0.827586 // sell
						if( Negative_Money_Flow_Sum > 563779 )
							if( MFI_High <= -45.483 )
								if( Raw_Money_Flow <= 64079.3 )
									ret := 0.165975
								if( Raw_Money_Flow > 64079.3 )
									ret := 0.480769
							if( MFI_High > -45.483 )
								if( ema13 <= 0.016938 )
									ret := -0.202381
								if( ema13 > 0.016938 )
									ret := -0.684211
					if( Money_Flow_Ratio > 0.704029 )
						if( ema12 <= 0.026411 )
							if( Positive_Money_Flow_Sum <= 57118.8 )
								if( ema2 <= 11.2556 )
									ret := 0.944444 // buy
								if( ema2 > 11.2556 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 57118.8 )
								if( Raw_Money_Flow <= 230158 )
									ret := 0.169875
								if( Raw_Money_Flow > 230158 )
									ret := -0.083333
						if( ema12 > 0.026411 )
							if( MFI_Low <= 63.6573 )
								if( Raw_Money_Flow <= 65287 )
									ret := -0.098160
								if( Raw_Money_Flow > 65287 )
									ret := 0.258824
							if( MFI_Low > 63.6573 )
								if( Positive_Money_Flow_Sum <= 2.77079e+06 )
									ret := -0.285714
								if( Positive_Money_Flow_Sum > 2.77079e+06 )
									ret := -0.921053 // sell
			if( Typical_Price > 16.8869 )
				if( Negative_Money_Flow_Sum <= 922356 )
					if( MFI <= 17.038 )
						if( Raw_Money_Flow <= 70839.6 )
							if( ema2 <= 18.3113 )
								if( MFI <= 11.6303 )
									ret := 0.961538 // buy
								if( MFI > 11.6303 )
									ret := 0.375000
							if( ema2 > 18.3113 )
								if( Positive_Money_Flow_Sum <= 39297.2 )
									ret := -0.444444
								if( Positive_Money_Flow_Sum > 39297.2 )
									ret := 0.465116
						if( Raw_Money_Flow > 70839.6 )
							if( Raw_Money_Flow <= 87456.7 )
								ret := -0.769231 // sell
							if( Raw_Money_Flow > 87456.7 )
								if( MFI_Low <= -4.59401 )
									ret := -0.240000
								if( MFI_Low > -4.59401 )
									ret := 0.538462
					if( MFI > 17.038 )
						if( Negative_Money_Flow <= 126795 )
							if( MFI <= 49.1355 )
								if( Positive_Money_Flow_Sum <= 557110 )
									ret := -0.068224
								if( Positive_Money_Flow_Sum > 557110 )
									ret := 0.442308
							if( MFI > 49.1355 )
								if( tema <= 22.4294 )
									ret := 0.146231
								if( tema > 22.4294 )
									ret := -0.026104
						if( Negative_Money_Flow > 126795 )
							if( MFI_High <= -35.2147 )
								if( Money_Flow_Ratio <= 0.682524 )
									ret := -0.108696
								if( Money_Flow_Ratio > 0.682524 )
									ret := 0.575758
							if( MFI_High > -35.2147 )
								if( ema13 <= -0.038231 )
									ret := 0.300000
								if( ema13 > -0.038231 )
									ret := -0.326870
				if( Negative_Money_Flow_Sum > 922356 )
					if( Positive_Money_Flow <= 944.621 )
						if( ema12 <= 0.011114 )
							if( MFI_Low <= 20.7301 )
								if( MFI <= 29.8408 )
									ret := 0.257143
								if( MFI > 29.8408 )
									ret := 0.651163
							if( MFI_Low > 20.7301 )
								if( ema13 <= -0.031261 )
									ret := 0.400000
								if( ema13 > -0.031261 )
									ret := -0.102041
						if( ema12 > 0.011114 )
							if( Positive_Money_Flow_Sum <= 2.10391e+06 )
								if( ema3 <= 23.1283 )
									ret := 0.928571 // buy
								if( ema3 > 23.1283 )
									ret := 0.461538
							if( Positive_Money_Flow_Sum > 2.10391e+06 )
								ret := 0.266667
					if( Positive_Money_Flow > 944.621 )
						if( MFI <= 54.8622 )
							ret := -1.000000 // sell
						if( MFI > 54.8622 )
							ret := 0.384615
		if( Negative_Money_Flow_Sum > 1.02627e+06 )
			if( tema <= 10.5944 )
				if( MFI <= 28.6093 )
					if( ema2 <= 10.2708 )
						if( Negative_Money_Flow_Sum <= 1.51267e+08 )
							if( Negative_Money_Flow <= 4.70661e+06 )
								if( ema1 <= 9.7745 )
									ret := 0.292208
								if( ema1 > 9.7745 )
									ret := -0.370079
							if( Negative_Money_Flow > 4.70661e+06 )
								if( MFI_Low <= -16.8059 )
									ret := -0.204082
								if( MFI_Low > -16.8059 )
									ret := 0.640625
						if( Negative_Money_Flow_Sum > 1.51267e+08 )
							if( tema <= 9.12816 )
								ret := -1.000000 // sell
							if( tema > 9.12816 )
								ret := -0.750000 // sell
					if( ema2 > 10.2708 )
						if( Positive_Money_Flow_Sum <= 974889 )
							if( Negative_Money_Flow_Sum <= 2.2859e+06 )
								if( MFI <= 12.8427 )
									ret := 0.333333
								if( MFI > 12.8427 )
									ret := 0.739130 // buy
							if( Negative_Money_Flow_Sum > 2.2859e+06 )
								if( Negative_Money_Flow_Sum <= 8.00801e+06 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 8.00801e+06 )
									ret := 0.113636
						if( Positive_Money_Flow_Sum > 974889 )
							if( MFI <= 9.47364 )
								if( Negative_Money_Flow_Sum <= 1.5316e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.5316e+08 )
									ret := 0.800000 // buy
							if( MFI > 9.47364 )
								if( MFI_Low <= -4.51949 )
									ret := 0.000000
								if( MFI_Low > -4.51949 )
									ret := 0.572193
				if( MFI > 28.6093 )
					if( Negative_Money_Flow <= 7.64574e+06 )
						if( MFI <= 59.9028 )
							if( ema13 <= -0.040979 )
								if( ema2 <= 10.5785 )
									ret := -0.388235
								if( ema2 > 10.5785 )
									ret := 0.440000
							if( ema13 > -0.040979 )
								if( Negative_Money_Flow <= 3.21765e+06 )
									ret := 0.121279
								if( Negative_Money_Flow > 3.21765e+06 )
									ret := 0.335793
						if( MFI > 59.9028 )
							if( ema13 <= -0.032981 )
								ret := 0.636364
							if( ema13 > -0.032981 )
								if( ema1 <= 10.5442 )
									ret := -0.055310
								if( ema1 > 10.5442 )
									ret := -0.913043 // sell
					if( Negative_Money_Flow > 7.64574e+06 )
						if( ema12 <= -0.046788 )
							ret := 0.789474 // buy
						if( ema12 > -0.046788 )
							if( Positive_Money_Flow_Sum <= 7.54238e+07 )
								if( MFI <= 49.6226 )
									ret := -0.316456
								if( MFI > 49.6226 )
									ret := -0.659574
							if( Positive_Money_Flow_Sum > 7.54238e+07 )
								ret := 0.285714
			if( tema > 10.5944 )
				if( Raw_Money_Flow <= 5.30798e+06 )
					if( MFI <= 45.4972 )
						if( MFI_Low <= 17.3398 )
							if( Negative_Money_Flow <= 1.66835e+06 )
								if( ema13 <= -0.093953 )
									ret := 0.240360
								if( ema13 > -0.093953 )
									ret := 0.017944
							if( Negative_Money_Flow > 1.66835e+06 )
								if( Negative_Money_Flow_Sum <= 5.61943e+07 )
									ret := -0.075810
								if( Negative_Money_Flow_Sum > 5.61943e+07 )
									ret := 0.158779
						if( MFI_Low > 17.3398 )
							if( Typical_Price <= 25.7598 )
								if( ema12 <= -0.045549 )
									ret := -0.081433
								if( ema12 > -0.045549 )
									ret := 0.157088
							if( Typical_Price > 25.7598 )
								if( ema1 <= 26.6532 )
									ret := -0.692308
								if( ema1 > 26.6532 )
									ret := 0.000000
					if( MFI > 45.4972 )
						if( ema13 <= -0.125814 )
							if( Negative_Money_Flow <= 1.0765e+06 )
								if( ema3 <= 22.0315 )
									ret := -0.680000
								if( ema3 > 22.0315 )
									ret := 0.272727
							if( Negative_Money_Flow > 1.0765e+06 )
								if( ema13 <= -0.148151 )
									ret := -1.000000 // sell
								if( ema13 > -0.148151 )
									ret := -0.391304
						if( ema13 > -0.125814 )
							if( Money_Flow_Ratio <= 2.71803 )
								if( tema <= 13.7344 )
									ret := -0.093628
								if( tema > 13.7344 )
									ret := 0.013234
							if( Money_Flow_Ratio > 2.71803 )
								if( Negative_Money_Flow_Sum <= 1.11038e+07 )
									ret := 0.161629
								if( Negative_Money_Flow_Sum > 1.11038e+07 )
									ret := -0.017188
				if( Raw_Money_Flow > 5.30798e+06 )
					if( Money_Flow_Ratio <= 0.037437 )
						if( Negative_Money_Flow_Sum <= 1.66461e+08 )
							if( ema12 <= -0.234715 )
								ret := -1.000000 // sell
							if( ema12 > -0.234715 )
								if( Negative_Money_Flow <= 2.29467e+07 )
									ret := -0.375635
								if( Negative_Money_Flow > 2.29467e+07 )
									ret := 0.333333
						if( Negative_Money_Flow_Sum > 1.66461e+08 )
							ret := 1.000000 // buy
					if( Money_Flow_Ratio > 0.037437 )
						if( Typical_Price <= 20.1944 )
							if( ema2 <= 20.1985 )
								if( ema3 <= 11.4156 )
									ret := 0.124777
								if( ema3 > 11.4156 )
									ret := -0.083159
							if( ema2 > 20.1985 )
								if( MFI <= 13.0161 )
									ret := -0.250000
								if( MFI > 13.0161 )
									ret := -0.892857 // sell
						if( Typical_Price > 20.1944 )
							if( ema12 <= -0.201968 )
								if( Negative_Money_Flow_Sum <= 5.31724e+08 )
									ret := 0.361702
								if( Negative_Money_Flow_Sum > 5.31724e+08 )
									ret := 1.000000 // buy
							if( ema12 > -0.201968 )
								if( ema3 <= 22.8519 )
									ret := 0.154864
								if( ema3 > 22.8519 )
									ret := -0.050207
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_RIVN_5Min_c77295a6(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)

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


