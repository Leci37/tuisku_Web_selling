//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: NVDA_30Min_2BM0_15335a62 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2BM0_15335a62", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_15335a62(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Money_Flow_Ratio <= 2.46014 )
		if( Raw_Money_Flow <= 9.08626e+07 )
			if( bbp <= -9.39578 )
				if( bbp <= -41.2436 )
					if( Positive_Money_Flow_Sum <= 1.73399e+08 )
						ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.73399e+08 )
						ret := -0.250000
				if( bbp > -41.2436 )
					if( Raw_Money_Flow <= 863688 )
						if( MFI_Low <= 14.2779 )
							if( Typical_Price <= 441.96 )
								if( Raw_Money_Flow <= 175585 )
									ret := 0.500000
								if( Raw_Money_Flow > 175585 )
									ret := 1.000000 // buy
							if( Typical_Price > 441.96 )
								if( Money_Flow_Ratio <= 0.387628 )
									ret := -0.066667
								if( Money_Flow_Ratio > 0.387628 )
									ret := 0.500000
						if( MFI_Low > 14.2779 )
							if( MFI_High <= -10.7572 )
								if( bbm <= 0.785 )
									ret := -0.166667
								if( bbm > 0.785 )
									ret := -0.772727 // sell
							if( MFI_High > -10.7572 )
								ret := 0.200000
					if( Raw_Money_Flow > 863688 )
						if( bbm <= 0.842715 )
							if( Positive_Money_Flow_Sum <= 5.28281e+08 )
								if( Positive_Money_Flow_Sum <= 2.42643e+08 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 2.42643e+08 )
									ret := 0.900000 // buy
							if( Positive_Money_Flow_Sum > 5.28281e+08 )
								if( Typical_Price <= 227.086 )
									ret := -0.411765
								if( Typical_Price > 227.086 )
									ret := 0.086957
						if( bbm > 0.842715 )
							if( MFI_High <= -22.5247 )
								if( Negative_Money_Flow_Sum <= 1.2279e+08 )
									ret := 0.851064 // buy
								if( Negative_Money_Flow_Sum > 1.2279e+08 )
									ret := 0.461694
							if( MFI_High > -22.5247 )
								if( Positive_Money_Flow <= 280689 )
									ret := 0.500000
								if( Positive_Money_Flow > 280689 )
									ret := -0.615385
			if( bbp > -9.39578 )
				if( Negative_Money_Flow_Sum <= 7.52614e+09 )
					if( bullPower <= 0.266061 )
						if( Negative_Money_Flow_Sum <= 7.33037e+09 )
							if( bearPower <= -3.24168 )
								if( Positive_Money_Flow_Sum <= 2.32391e+09 )
									ret := 0.215357
								if( Positive_Money_Flow_Sum > 2.32391e+09 )
									ret := -0.156522
							if( bearPower > -3.24168 )
								if( Raw_Money_Flow <= 793317 )
									ret := 0.107493
								if( Raw_Money_Flow > 793317 )
									ret := 0.044566
						if( Negative_Money_Flow_Sum > 7.33037e+09 )
							if( bearPower <= -1.74516 )
								if( bbp <= -7.4585 )
									ret := 0.250000
								if( bbp > -7.4585 )
									ret := -0.928571 // sell
							if( bearPower > -1.74516 )
								if( Raw_Money_Flow <= 1.38692e+07 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.38692e+07 )
									ret := 0.500000
					if( bullPower > 0.266061 )
						if( Negative_Money_Flow_Sum <= 9.71647e+07 )
							if( Negative_Money_Flow_Sum <= 4.80492e+07 )
								if( Raw_Money_Flow <= 6.23486e+06 )
									ret := -0.131148
								if( Raw_Money_Flow > 6.23486e+06 )
									ret := 0.132976
							if( Negative_Money_Flow_Sum > 4.80492e+07 )
								if( Negative_Money_Flow_Sum <= 8.00759e+07 )
									ret := -0.111232
								if( Negative_Money_Flow_Sum > 8.00759e+07 )
									ret := -0.349030
						if( Negative_Money_Flow_Sum > 9.71647e+07 )
							if( Positive_Money_Flow <= 5.95272e+07 )
								if( Money_Flow_Ratio <= 1.96571 )
									ret := 0.050235
								if( Money_Flow_Ratio > 1.96571 )
									ret := -0.077110
							if( Positive_Money_Flow > 5.95272e+07 )
								if( bbm <= 5.49129 )
									ret := 0.211783
								if( bbm > 5.49129 )
									ret := -0.405405
				if( Negative_Money_Flow_Sum > 7.52614e+09 )
					if( MFI_High <= -79.2267 )
						if( MFI <= 0.540166 )
							ret := -1.000000 // sell
						if( MFI > 0.540166 )
							ret := -0.500000
					if( MFI_High > -79.2267 )
						if( Positive_Money_Flow_Sum <= 5.37937e+09 )
							if( Positive_Money_Flow_Sum <= 4.51754e+09 )
								if( Positive_Money_Flow_Sum <= 2.47687e+09 )
									ret := 0.025641
								if( Positive_Money_Flow_Sum > 2.47687e+09 )
									ret := 0.299180
							if( Positive_Money_Flow_Sum > 4.51754e+09 )
								if( MFI_Low <= 16.0582 )
									ret := -0.421053
								if( MFI_Low > 16.0582 )
									ret := 0.192308
						if( Positive_Money_Flow_Sum > 5.37937e+09 )
							if( Raw_Money_Flow <= 3.4138e+07 )
								if( bullPower <= -0.009715 )
									ret := 0.139706
								if( bullPower > -0.009715 )
									ret := 0.381679
							if( Raw_Money_Flow > 3.4138e+07 )
								if( Money_Flow_Ratio <= 0.783046 )
									ret := 0.600000
								if( Money_Flow_Ratio > 0.783046 )
									ret := 0.326316
		if( Raw_Money_Flow > 9.08626e+07 )
			if( Money_Flow_Ratio <= 1.78739 )
				if( Negative_Money_Flow_Sum <= 5.25059e+08 )
					if( Negative_Money_Flow <= 1.20673e+08 )
						if( bearPower <= -1.89689 )
							if( MFI_High <= -37.5146 )
								if( Raw_Money_Flow <= 1.02825e+08 )
									ret := -0.595238
								if( Raw_Money_Flow > 1.02825e+08 )
									ret := 0.170213
							if( MFI_High > -37.5146 )
								if( bbp <= -1.39352 )
									ret := -0.245283
								if( bbp > -1.39352 )
									ret := -0.807018 // sell
						if( bearPower > -1.89689 )
							if( MFI <= 54.5497 )
								if( BBPower_Color <= 0.5 )
									ret := -0.058824
								if( BBPower_Color > 0.5 )
									ret := 0.263158
							if( MFI > 54.5497 )
								if( Positive_Money_Flow <= 3.18177e+08 )
									ret := -0.201365
								if( Positive_Money_Flow > 3.18177e+08 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow > 1.20673e+08 )
						if( bearPower <= -0.969866 )
							if( Positive_Money_Flow_Sum <= 3.07788e+06 )
								if( bullPower <= -0.652686 )
									ret := -0.684211
								if( bullPower > -0.652686 )
									ret := 0.142857
							if( Positive_Money_Flow_Sum > 3.07788e+06 )
								if( bbm <= 14.3882 )
									ret := 0.321429
								if( bbm > 14.3882 )
									ret := -0.928571 // sell
						if( bearPower > -0.969866 )
							if( Negative_Money_Flow <= 2.11747e+08 )
								if( bullPower <= 2.36216 )
									ret := 0.016807
								if( bullPower > 2.36216 )
									ret := 0.681818
							if( Negative_Money_Flow > 2.11747e+08 )
								if( Raw_Money_Flow <= 2.81627e+08 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 2.81627e+08 )
									ret := -0.062500
				if( Negative_Money_Flow_Sum > 5.25059e+08 )
					if( bearPower <= -10.9436 )
						if( Raw_Money_Flow <= 3.52109e+08 )
							if( Positive_Money_Flow_Sum <= 6.85638e+08 )
								if( Negative_Money_Flow_Sum <= 1.9692e+09 )
									ret := -0.142857
								if( Negative_Money_Flow_Sum > 1.9692e+09 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 6.85638e+08 )
								if( bullPower <= -0.987447 )
									ret := 0.704225 // buy
								if( bullPower > -0.987447 )
									ret := 0.250000
						if( Raw_Money_Flow > 3.52109e+08 )
							if( Money_Flow_Ratio <= 0.18368 )
								if( Typical_Price <= 284.694 )
									ret := 0.731707 // buy
								if( Typical_Price > 284.694 )
									ret := 0.228669
							if( Money_Flow_Ratio > 0.18368 )
								if( bearPower <= -21.6939 )
									ret := -0.508475
								if( bearPower > -21.6939 )
									ret := -0.014409
					if( bearPower > -10.9436 )
						if( Negative_Money_Flow_Sum <= 2.2527e+10 )
							if( Positive_Money_Flow_Sum <= 1.78949e+10 )
								if( bullPower <= 19.6858 )
									ret := -0.028257
								if( bullPower > 19.6858 )
									ret := 0.772727 // buy
							if( Positive_Money_Flow_Sum > 1.78949e+10 )
								if( Raw_Money_Flow <= 2.58757e+09 )
									ret := 0.458647
								if( Raw_Money_Flow > 2.58757e+09 )
									ret := -0.116279
						if( Negative_Money_Flow_Sum > 2.2527e+10 )
							if( MFI_High <= -71.1326 )
								if( Negative_Money_Flow <= 3.42663e+09 )
									ret := 0.933333 // buy
								if( Negative_Money_Flow > 3.42663e+09 )
									ret := 0.250000
							if( MFI_High > -71.1326 )
								if( Negative_Money_Flow_Sum <= 3.48595e+10 )
									ret := -0.470032
								if( Negative_Money_Flow_Sum > 3.48595e+10 )
									ret := 0.106383
			if( Money_Flow_Ratio > 1.78739 )
				if( Raw_Money_Flow <= 2.19694e+08 )
					if( Positive_Money_Flow_Sum <= 8.03459e+08 )
						if( Positive_Money_Flow_Sum <= 4.81455e+08 )
							if( bbp <= 6.83154 )
								if( Typical_Price <= 233.205 )
									ret := 0.000000
								if( Typical_Price > 233.205 )
									ret := 0.651163
							if( bbp > 6.83154 )
								if( bbp <= 8.96349 )
									ret := -1.000000 // sell
								if( bbp > 8.96349 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 4.81455e+08 )
							if( bearPower <= -0.375069 )
								if( Positive_Money_Flow <= 1.90506e+08 )
									ret := -0.257143
								if( Positive_Money_Flow > 1.90506e+08 )
									ret := 0.777778 // buy
							if( bearPower > -0.375069 )
								if( bearPower <= 1.69314 )
									ret := -0.747126 // sell
								if( bearPower > 1.69314 )
									ret := 0.125000
					if( Positive_Money_Flow_Sum > 8.03459e+08 )
						if( Negative_Money_Flow_Sum <= 5.99291e+08 )
							if( bbm <= 0.705 )
								if( bbm <= 0.476165 )
									ret := -0.333333
								if( bbm > 0.476165 )
									ret := 0.000000
							if( bbm > 0.705 )
								if( BBPower_Color <= 0.5 )
									ret := 0.549296
								if( BBPower_Color > 0.5 )
									ret := 0.288732
						if( Negative_Money_Flow_Sum > 5.99291e+08 )
							if( Positive_Money_Flow_Sum <= 1.44807e+09 )
								if( Money_Flow_Ratio <= 1.97766 )
									ret := -0.076923
								if( Money_Flow_Ratio > 1.97766 )
									ret := -0.611111
							if( Positive_Money_Flow_Sum > 1.44807e+09 )
								if( Negative_Money_Flow_Sum <= 7.68235e+08 )
									ret := 0.295082
								if( Negative_Money_Flow_Sum > 7.68235e+08 )
									ret := -0.127119
				if( Raw_Money_Flow > 2.19694e+08 )
					if( Negative_Money_Flow_Sum <= 1.97991e+09 )
						if( Positive_Money_Flow_Sum <= 2.76369e+09 )
							if( bbp <= 3.75873 )
								if( Positive_Money_Flow_Sum <= 9.45089e+08 )
									ret := 0.369565
								if( Positive_Money_Flow_Sum > 9.45089e+08 )
									ret := -0.051724
							if( bbp > 3.75873 )
								if( Positive_Money_Flow <= 4.66433e+08 )
									ret := 0.496350
								if( Positive_Money_Flow > 4.66433e+08 )
									ret := -0.166667
						if( Positive_Money_Flow_Sum > 2.76369e+09 )
							if( Money_Flow_Ratio <= 2.11094 )
								if( Negative_Money_Flow_Sum <= 1.7044e+09 )
									ret := 0.739726 // buy
								if( Negative_Money_Flow_Sum > 1.7044e+09 )
									ret := 0.378378
							if( Money_Flow_Ratio > 2.11094 )
								if( Negative_Money_Flow <= 3.42969e+08 )
									ret := 0.396226
								if( Negative_Money_Flow > 3.42969e+08 )
									ret := -0.102564
					if( Negative_Money_Flow_Sum > 1.97991e+09 )
						if( Negative_Money_Flow_Sum <= 2.58924e+09 )
							if( Typical_Price <= 182.345 )
								if( Positive_Money_Flow_Sum <= 4.38e+09 )
									ret := 0.727273 // buy
								if( Positive_Money_Flow_Sum > 4.38e+09 )
									ret := -0.217391
							if( Typical_Price > 182.345 )
								if( bearPower <= 3.81382 )
									ret := -0.289474
								if( bearPower > 3.81382 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 2.58924e+09 )
							if( Positive_Money_Flow <= 4.07778e+09 )
								if( bbm <= 6.08495 )
									ret := 0.093290
								if( bbm > 6.08495 )
									ret := 0.397849
							if( Positive_Money_Flow > 4.07778e+09 )
								if( bbp <= 21.1354 )
									ret := -0.500000
								if( bbp > 21.1354 )
									ret := -1.000000 // sell
	if( Money_Flow_Ratio > 2.46014 )
		if( Raw_Money_Flow <= 8.77399e+08 )
			if( Negative_Money_Flow <= 4.50633e+08 )
				if( bullPower <= 4.04358 )
					if( bbm <= 1.31319 )
						if( MFI_High <= -0.579177 )
							if( Positive_Money_Flow_Sum <= 7.7873e+08 )
								if( bearPower <= 0.521056 )
									ret := 0.193473
								if( bearPower > 0.521056 )
									ret := -0.084249
							if( Positive_Money_Flow_Sum > 7.7873e+08 )
								if( Positive_Money_Flow_Sum <= 9.21833e+08 )
									ret := -0.213018
								if( Positive_Money_Flow_Sum > 9.21833e+08 )
									ret := 0.010383
						if( MFI_High > -0.579177 )
							if( Positive_Money_Flow_Sum <= 1.82094e+09 )
								if( bbm <= 0.480049 )
									ret := 0.014837
								if( bbm > 0.480049 )
									ret := 0.145584
							if( Positive_Money_Flow_Sum > 1.82094e+09 )
								if( bullPower <= 1.82578 )
									ret := 0.142430
								if( bullPower > 1.82578 )
									ret := 0.338301
					if( bbm > 1.31319 )
						if( MFI_Low <= 77.9886 )
							if( Positive_Money_Flow <= 1.44342e+08 )
								if( Raw_Money_Flow <= 2.07542e+07 )
									ret := 0.129231
								if( Raw_Money_Flow > 2.07542e+07 )
									ret := -0.096943
							if( Positive_Money_Flow > 1.44342e+08 )
								if( bearPower <= 1.55035 )
									ret := 0.102431
								if( bearPower > 1.55035 )
									ret := 0.418182
						if( MFI_Low > 77.9886 )
							if( bbp <= 4.80395 )
								if( bullPower <= 2.87676 )
									ret := -0.092081
								if( bullPower > 2.87676 )
									ret := -0.405063
							if( bbp > 4.80395 )
								if( Money_Flow_Ratio <= 395.779 )
									ret := 0.394737
								if( Money_Flow_Ratio > 395.779 )
									ret := -0.857143 // sell
				if( bullPower > 4.04358 )
					if( bbm <= 5.03045 )
						if( Positive_Money_Flow_Sum <= 6.73962e+08 )
							if( Typical_Price <= 335.237 )
								if( bbp <= 5.67389 )
									ret := 0.045455
								if( bbp > 5.67389 )
									ret := -0.880000 // sell
							if( Typical_Price > 335.237 )
								if( Positive_Money_Flow_Sum <= 4.62134e+08 )
									ret := 0.177966
								if( Positive_Money_Flow_Sum > 4.62134e+08 )
									ret := -0.692308
						if( Positive_Money_Flow_Sum > 6.73962e+08 )
							if( Raw_Money_Flow <= 6.18455e+08 )
								if( Money_Flow_Ratio <= 374.9 )
									ret := 0.058036
								if( Money_Flow_Ratio > 374.9 )
									ret := 0.500000
							if( Raw_Money_Flow > 6.18455e+08 )
								if( bearPower <= 3.87463 )
									ret := -0.288770
								if( bearPower > 3.87463 )
									ret := 0.225352
					if( bbm > 5.03045 )
						if( Typical_Price <= 244.789 )
							if( Raw_Money_Flow <= 1.5856e+08 )
								if( MFI <= 77.1431 )
									ret := -1.000000 // sell
								if( MFI > 77.1431 )
									ret := 0.800000 // buy
							if( Raw_Money_Flow > 1.5856e+08 )
								if( bbm <= 6.18001 )
									ret := -0.437500
								if( bbm > 6.18001 )
									ret := -0.888889 // sell
						if( Typical_Price > 244.789 )
							if( Negative_Money_Flow <= 7.45026e+06 )
								if( Raw_Money_Flow <= 3.24073e+08 )
									ret := -0.427632
								if( Raw_Money_Flow > 3.24073e+08 )
									ret := 0.016064
							if( Negative_Money_Flow > 7.45026e+06 )
								if( Negative_Money_Flow <= 2.48567e+07 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow > 2.48567e+07 )
									ret := 0.208333
			if( Negative_Money_Flow > 4.50633e+08 )
				if( MFI <= 82.4361 )
					if( Raw_Money_Flow <= 6.90843e+08 )
						if( Positive_Money_Flow_Sum <= 4.03732e+09 )
							if( Positive_Money_Flow_Sum <= 1.76528e+09 )
								if( bearPower <= -1.78665 )
									ret := 1.000000 // buy
								if( bearPower > -1.78665 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 1.76528e+09 )
								if( Raw_Money_Flow <= 5.25977e+08 )
									ret := 0.944444 // buy
								if( Raw_Money_Flow > 5.25977e+08 )
									ret := 0.645833
						if( Positive_Money_Flow_Sum > 4.03732e+09 )
							if( Positive_Money_Flow_Sum <= 5.0273e+09 )
								if( bbm <= 2.34446 )
									ret := 0.235294
								if( bbm > 2.34446 )
									ret := -0.560000
							if( Positive_Money_Flow_Sum > 5.0273e+09 )
								if( MFI <= 81.3543 )
									ret := 0.673684
								if( MFI > 81.3543 )
									ret := 0.000000
					if( Raw_Money_Flow > 6.90843e+08 )
						if( BBPower_Color <= 0.5 )
							if( bbm <= 3.71923 )
								if( bbm <= 2.57026 )
									ret := 0.750000 // buy
								if( bbm > 2.57026 )
									ret := 1.000000 // buy
							if( bbm > 3.71923 )
								ret := 0.000000
						if( BBPower_Color > 0.5 )
							if( bbm <= 3.36419 )
								if( MFI_High <= -3.53151 )
									ret := 0.020408
								if( MFI_High > -3.53151 )
									ret := 0.434783
							if( bbm > 3.36419 )
								if( MFI <= 74.6208 )
									ret := -1.000000 // sell
								if( MFI > 74.6208 )
									ret := -0.166667
				if( MFI > 82.4361 )
					if( Positive_Money_Flow_Sum <= 3.17601e+09 )
						if( Money_Flow_Ratio <= 5.04243 )
							ret := -0.333333
						if( Money_Flow_Ratio > 5.04243 )
							if( Raw_Money_Flow <= 4.74323e+08 )
								ret := -0.750000 // sell
							if( Raw_Money_Flow > 4.74323e+08 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 3.17601e+09 )
						if( Positive_Money_Flow_Sum <= 5.02022e+09 )
							if( bbm <= 3.11908 )
								if( Negative_Money_Flow_Sum <= 6.59185e+08 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 6.59185e+08 )
									ret := 0.933333 // buy
							if( bbm > 3.11908 )
								if( Positive_Money_Flow_Sum <= 4.17839e+09 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 4.17839e+09 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 5.02022e+09 )
							if( bbm <= 2.36497 )
								if( Positive_Money_Flow_Sum <= 5.55792e+09 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 5.55792e+09 )
									ret := 0.375000
							if( bbm > 2.36497 )
								if( Negative_Money_Flow <= 7.2314e+08 )
									ret := -0.652174
								if( Negative_Money_Flow > 7.2314e+08 )
									ret := 0.500000
		if( Raw_Money_Flow > 8.77399e+08 )
			if( bbp <= 40.1421 )
				if( bearPower <= 3.04275 )
					if( Positive_Money_Flow_Sum <= 9.93024e+08 )
						if( Money_Flow_Ratio <= 29.1574 )
							if( bullPower <= 1.58925 )
								if( MFI_High <= 16.0886 )
									ret := 0.250000
								if( MFI_High > 16.0886 )
									ret := 1.000000 // buy
							if( bullPower > 1.58925 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 29.1574 )
							if( bullPower <= 5.12509 )
								ret := -0.428571
							if( bullPower > 5.12509 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 9.93024e+08 )
						if( Negative_Money_Flow_Sum <= 9.35047e+09 )
							if( Negative_Money_Flow <= 1.97822e+09 )
								if( Positive_Money_Flow_Sum <= 2.03081e+10 )
									ret := 0.177684
								if( Positive_Money_Flow_Sum > 2.03081e+10 )
									ret := -0.190000
							if( Negative_Money_Flow > 1.97822e+09 )
								if( Negative_Money_Flow <= 3.48501e+09 )
									ret := -0.493671
								if( Negative_Money_Flow > 3.48501e+09 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 9.35047e+09 )
							if( Raw_Money_Flow <= 2.41558e+09 )
								if( Positive_Money_Flow <= 4.10259e+07 )
									ret := -0.200000
								if( Positive_Money_Flow > 4.10259e+07 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 2.41558e+09 )
								if( bbm <= 1.11039 )
									ret := 0.200000
								if( bbm > 1.11039 )
									ret := 0.850000 // buy
				if( bearPower > 3.04275 )
					if( Raw_Money_Flow <= 2.58682e+09 )
						if( Positive_Money_Flow_Sum <= 1.23008e+10 )
							if( Positive_Money_Flow <= 1.60444e+09 )
								if( Typical_Price <= 154.652 )
									ret := -0.500000
								if( Typical_Price > 154.652 )
									ret := 0.482412
							if( Positive_Money_Flow > 1.60444e+09 )
								if( bbp <= 15.8421 )
									ret := -0.348837
								if( bbp > 15.8421 )
									ret := 0.562500
						if( Positive_Money_Flow_Sum > 1.23008e+10 )
							if( bearPower <= 9.81104 )
								if( Typical_Price <= 801.476 )
									ret := 0.696970
								if( Typical_Price > 801.476 )
									ret := 0.386667
							if( bearPower > 9.81104 )
								if( bearPower <= 11.0418 )
									ret := -0.875000 // sell
								if( bearPower > 11.0418 )
									ret := 0.333333
					if( Raw_Money_Flow > 2.58682e+09 )
						if( Typical_Price <= 775.603 )
							if( bullPower <= 8.42451 )
								if( Negative_Money_Flow_Sum <= 1.36813e+09 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.36813e+09 )
									ret := 0.250000
							if( bullPower > 8.42451 )
								if( Positive_Money_Flow_Sum <= 9.11753e+09 )
									ret := 0.384615
								if( Positive_Money_Flow_Sum > 9.11753e+09 )
									ret := -0.622642
						if( Typical_Price > 775.603 )
							if( Negative_Money_Flow <= 3.44575e+09 )
								if( Raw_Money_Flow <= 3.52824e+09 )
									ret := 0.277778
								if( Raw_Money_Flow > 3.52824e+09 )
									ret := 0.649123
							if( Negative_Money_Flow > 3.44575e+09 )
								ret := -1.000000 // sell
			if( bbp > 40.1421 )
				if( bbm <= 7.223 )
					ret := 0.000000
				if( bbm > 7.223 )
					if( bearPower <= 16.5248 )
						if( bbp <= 41.7814 )
							ret := -0.750000 // sell
						if( bbp > 41.7814 )
							ret := 0.000000
					if( bearPower > 16.5248 )
						ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_NVDA_30Min_15335a62(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


