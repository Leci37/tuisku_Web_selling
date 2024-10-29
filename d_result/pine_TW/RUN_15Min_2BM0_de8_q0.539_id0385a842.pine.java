//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: RUN_15Min_2BM0_0385a842 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_15Min_2BM0_0385a842", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_15Min_0385a842(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 47.4817 )
		if( Raw_Money_Flow <= 254918 )
			if( bullPower <= 0.119474 )
				if( bbm <= 0.118846 )
					if( Positive_Money_Flow_Sum <= 479095 )
						if( Typical_Price <= 44.8544 )
							if( Positive_Money_Flow_Sum <= 126947 )
								if( MFI <= 46.618 )
									ret := -0.025918
								if( MFI > 46.618 )
									ret := 0.282051
							if( Positive_Money_Flow_Sum > 126947 )
								if( Typical_Price <= 7.28487 )
									ret := 0.025974
								if( Typical_Price > 7.28487 )
									ret := -0.145212
						if( Typical_Price > 44.8544 )
							if( Raw_Money_Flow <= 9481.15 )
								if( Positive_Money_Flow_Sum <= 429738 )
									ret := 0.571429
								if( Positive_Money_Flow_Sum > 429738 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 9481.15 )
								if( Negative_Money_Flow_Sum <= 844450 )
									ret := -0.098361
								if( Negative_Money_Flow_Sum > 844450 )
									ret := 0.461538
					if( Positive_Money_Flow_Sum > 479095 )
						if( Negative_Money_Flow_Sum <= 1.53855e+07 )
							if( Negative_Money_Flow_Sum <= 5.77933e+06 )
								if( Positive_Money_Flow_Sum <= 1.13022e+06 )
									ret := 0.125996
								if( Positive_Money_Flow_Sum > 1.13022e+06 )
									ret := 0.022802
							if( Negative_Money_Flow_Sum > 5.77933e+06 )
								if( Negative_Money_Flow_Sum <= 8.11333e+06 )
									ret := 0.325658
								if( Negative_Money_Flow_Sum > 8.11333e+06 )
									ret := 0.071186
						if( Negative_Money_Flow_Sum > 1.53855e+07 )
							if( MFI_Low <= 67.0626 )
								if( Negative_Money_Flow_Sum <= 1.65993e+07 )
									ret := -0.261905
								if( Negative_Money_Flow_Sum > 1.65993e+07 )
									ret := -0.013924
							if( MFI_Low > 67.0626 )
								if( Positive_Money_Flow_Sum <= 8.37924e+08 )
									ret := -0.937500 // sell
								if( Positive_Money_Flow_Sum > 8.37924e+08 )
									ret := 0.500000
				if( bbm > 0.118846 )
					if( bbp <= -2.15008 )
						if( Positive_Money_Flow_Sum <= 1.72793e+06 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 1.72793e+06 )
							ret := 0.000000
					if( bbp > -2.15008 )
						if( Raw_Money_Flow <= 182868 )
							if( Negative_Money_Flow_Sum <= 130278 )
								if( MFI_Low <= 51.2712 )
									ret := 0.640000
								if( MFI_Low > 51.2712 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 130278 )
								if( Positive_Money_Flow_Sum <= 853307 )
									ret := -0.286802
								if( Positive_Money_Flow_Sum > 853307 )
									ret := -0.020173
						if( Raw_Money_Flow > 182868 )
							if( bbm <= 0.352467 )
								if( bbm <= 0.217899 )
									ret := -0.480519
								if( bbm > 0.217899 )
									ret := 0.058824
							if( bbm > 0.352467 )
								if( MFI_Low <= 50.1669 )
									ret := -0.937500 // sell
								if( MFI_Low > 50.1669 )
									ret := -0.500000
			if( bullPower > 0.119474 )
				if( Positive_Money_Flow_Sum <= 390518 )
					if( Typical_Price <= 38.8317 )
						if( Typical_Price <= 17.8884 )
							if( Positive_Money_Flow <= 33203.8 )
								if( bbm <= 0.056484 )
									ret := -0.100000
								if( bbm > 0.056484 )
									ret := -0.619048
							if( Positive_Money_Flow > 33203.8 )
								if( Negative_Money_Flow_Sum <= 94575.2 )
									ret := -0.344828
								if( Negative_Money_Flow_Sum > 94575.2 )
									ret := 0.230000
						if( Typical_Price > 17.8884 )
							if( Negative_Money_Flow_Sum <= 53092.8 )
								if( Raw_Money_Flow <= 54730.7 )
									ret := -0.125000
								if( Raw_Money_Flow > 54730.7 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 53092.8 )
								if( MFI_Low <= 18.4907 )
									ret := -0.256545
								if( MFI_Low > 18.4907 )
									ret := -0.559140
					if( Typical_Price > 38.8317 )
						if( MFI_Low <= 57.8144 )
							if( MFI_Low <= 49.0092 )
								if( Negative_Money_Flow_Sum <= 605071 )
									ret := -0.018779
								if( Negative_Money_Flow_Sum > 605071 )
									ret := -0.337209
							if( MFI_Low > 49.0092 )
								if( MFI_High <= -5.53434 )
									ret := -0.937500 // sell
								if( MFI_High > -5.53434 )
									ret := -0.250000
						if( MFI_Low > 57.8144 )
							if( MFI_Low <= 63.0198 )
								if( Positive_Money_Flow_Sum <= 340351 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 340351 )
									ret := 0.500000
							if( MFI_Low > 63.0198 )
								ret := -0.250000
				if( Positive_Money_Flow_Sum > 390518 )
					if( bbp <= 0.13504 )
						if( MFI_High <= -31.7879 )
							if( Raw_Money_Flow <= 204578 )
								if( Typical_Price <= 39.9563 )
									ret := -0.468750
								if( Typical_Price > 39.9563 )
									ret := 0.030303
							if( Raw_Money_Flow > 204578 )
								if( Typical_Price <= 21.42 )
									ret := 0.250000
								if( Typical_Price > 21.42 )
									ret := 0.818182 // buy
						if( MFI_High > -31.7879 )
							if( Typical_Price <= 14.7846 )
								if( Positive_Money_Flow_Sum <= 1.30056e+06 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 1.30056e+06 )
									ret := -0.571429
							if( Typical_Price > 14.7846 )
								if( Positive_Money_Flow_Sum <= 3.93173e+07 )
									ret := -0.705357 // sell
								if( Positive_Money_Flow_Sum > 3.93173e+07 )
									ret := -0.076923
					if( bbp > 0.13504 )
						if( bbp <= 0.758168 )
							if( Typical_Price <= 16.7315 )
								if( Money_Flow_Ratio <= 2.00659 )
									ret := -0.314448
								if( Money_Flow_Ratio > 2.00659 )
									ret := 0.010127
							if( Typical_Price > 16.7315 )
								if( Negative_Money_Flow_Sum <= 129003 )
									ret := 0.229592
								if( Negative_Money_Flow_Sum > 129003 )
									ret := -0.015856
						if( bbp > 0.758168 )
							if( Typical_Price <= 18.4483 )
								if( bullPower <= 0.468354 )
									ret := -0.578947
								if( bullPower > 0.468354 )
									ret := -0.916667 // sell
							if( Typical_Price > 18.4483 )
								if( Typical_Price <= 50.4563 )
									ret := -0.278552
								if( Typical_Price > 50.4563 )
									ret := -0.027160
		if( Raw_Money_Flow > 254918 )
			if( bullPower <= -0.369111 )
				if( Negative_Money_Flow_Sum <= 1.65451e+08 )
					if( Positive_Money_Flow <= 8.68946e+06 )
						if( Positive_Money_Flow_Sum <= 8.11285e+06 )
							if( Typical_Price <= 46.4854 )
								if( bbp <= -1.83122 )
									ret := -0.500000
								if( bbp > -1.83122 )
									ret := 0.649351
							if( Typical_Price > 46.4854 )
								if( bearPower <= -0.699964 )
									ret := 0.000000
								if( bearPower > -0.699964 )
									ret := -0.800000 // sell
						if( Positive_Money_Flow_Sum > 8.11285e+06 )
							if( Money_Flow_Ratio <= 1.31729 )
								if( Negative_Money_Flow_Sum <= 1.55485e+08 )
									ret := 0.010417
								if( Negative_Money_Flow_Sum > 1.55485e+08 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 1.31729 )
								if( MFI <= 65.0041 )
									ret := -1.000000 // sell
								if( MFI > 65.0041 )
									ret := -0.500000
					if( Positive_Money_Flow > 8.68946e+06 )
						if( Raw_Money_Flow <= 2.36715e+07 )
							if( Negative_Money_Flow_Sum <= 6.93716e+07 )
								if( Negative_Money_Flow_Sum <= 5.0345e+07 )
									ret := 0.551724
								if( Negative_Money_Flow_Sum > 5.0345e+07 )
									ret := -0.166667
							if( Negative_Money_Flow_Sum > 6.93716e+07 )
								if( Positive_Money_Flow_Sum <= 5.81705e+07 )
									ret := 0.687500
								if( Positive_Money_Flow_Sum > 5.81705e+07 )
									ret := 0.193548
						if( Raw_Money_Flow > 2.36715e+07 )
							if( bbm <= 1.95 )
								if( Raw_Money_Flow <= 2.72163e+07 )
									ret := 0.285714
								if( Raw_Money_Flow > 2.72163e+07 )
									ret := -0.476190
							if( bbm > 1.95 )
								if( Raw_Money_Flow <= 3.26412e+07 )
									ret := 0.500000
								if( Raw_Money_Flow > 3.26412e+07 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 1.65451e+08 )
					if( bearPower <= -1.01284 )
						if( MFI <= 20.7502 )
							ret := 0.000000
						if( MFI > 20.7502 )
							if( Raw_Money_Flow <= 2.53374e+07 )
								if( Money_Flow_Ratio <= 0.308083 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.308083 )
									ret := -0.187500
							if( Raw_Money_Flow > 2.53374e+07 )
								if( bbp <= -2.79877 )
									ret := -1.000000 // sell
								if( bbp > -2.79877 )
									ret := -0.750000 // sell
					if( bearPower > -1.01284 )
						if( MFI_Low <= 1.77115 )
							ret := -0.500000
						if( MFI_Low > 1.77115 )
							ret := 0.666667
			if( bullPower > -0.369111 )
				if( Typical_Price <= 52.1828 )
					if( Raw_Money_Flow <= 8.50601e+06 )
						if( MFI <= 89.0694 )
							if( Raw_Money_Flow <= 3.86468e+06 )
								if( Typical_Price <= 15.7286 )
									ret := 0.089683
								if( Typical_Price > 15.7286 )
									ret := -0.020315
							if( Raw_Money_Flow > 3.86468e+06 )
								if( Positive_Money_Flow_Sum <= 3.86251e+07 )
									ret := 0.162220
								if( Positive_Money_Flow_Sum > 3.86251e+07 )
									ret := 0.043752
						if( MFI > 89.0694 )
							if( Positive_Money_Flow_Sum <= 2.43124e+06 )
								if( Money_Flow_Ratio <= 9.59067 )
									ret := 0.000000
								if( Money_Flow_Ratio > 9.59067 )
									ret := 0.752475 // buy
							if( Positive_Money_Flow_Sum > 2.43124e+06 )
								if( Positive_Money_Flow_Sum <= 4.75781e+06 )
									ret := -0.341176
								if( Positive_Money_Flow_Sum > 4.75781e+06 )
									ret := 0.235294
					if( Raw_Money_Flow > 8.50601e+06 )
						if( bearPower <= 0.425081 )
							if( bearPower <= -0.588366 )
								if( Raw_Money_Flow <= 4.26086e+07 )
									ret := 0.123529
								if( Raw_Money_Flow > 4.26086e+07 )
									ret := 0.896552 // buy
							if( bearPower > -0.588366 )
								if( Negative_Money_Flow_Sum <= 5.27456e+07 )
									ret := -0.098976
								if( Negative_Money_Flow_Sum > 5.27456e+07 )
									ret := 0.101246
						if( bearPower > 0.425081 )
							if( Money_Flow_Ratio <= 9.88914 )
								if( Positive_Money_Flow <= 2.66165e+07 )
									ret := 0.403409
								if( Positive_Money_Flow > 2.66165e+07 )
									ret := -0.458333
							if( Money_Flow_Ratio > 9.88914 )
								if( MFI <= 99.3688 )
									ret := -0.206573
								if( MFI > 99.3688 )
									ret := 0.336364
				if( Typical_Price > 52.1828 )
					if( bearPower <= -0.26194 )
						if( Money_Flow_Ratio <= 42.6415 )
							if( Money_Flow_Ratio <= 27.5504 )
								if( Typical_Price <= 88.0222 )
									ret := -0.207108
								if( Typical_Price > 88.0222 )
									ret := 0.344828
							if( Money_Flow_Ratio > 27.5504 )
								if( bbm <= 1.26736 )
									ret := -0.500000
								if( bbm > 1.26736 )
									ret := 0.500000
						if( Money_Flow_Ratio > 42.6415 )
							if( bbp <= 1.1266 )
								if( Negative_Money_Flow_Sum <= 227248 )
									ret := -0.428571
								if( Negative_Money_Flow_Sum > 227248 )
									ret := -0.947368 // sell
							if( bbp > 1.1266 )
								if( bbp <= 1.8055 )
									ret := 0.100000
								if( bbp > 1.8055 )
									ret := -1.000000 // sell
					if( bearPower > -0.26194 )
						if( Money_Flow_Ratio <= 638.652 )
							if( bbm <= 1.25865 )
								if( Positive_Money_Flow <= 3.00142e+07 )
									ret := -0.014790
								if( Positive_Money_Flow > 3.00142e+07 )
									ret := 0.275510
							if( bbm > 1.25865 )
								if( Typical_Price <= 73.3814 )
									ret := -0.483051
								if( Typical_Price > 73.3814 )
									ret := 0.073171
						if( Money_Flow_Ratio > 638.652 )
							if( Negative_Money_Flow_Sum <= 56470.7 )
								ret := 0.142857
							if( Negative_Money_Flow_Sum > 56470.7 )
								if( bbm <= 1.50842 )
									ret := 1.000000 // buy
								if( bbm > 1.50842 )
									ret := 0.750000 // buy
	if( Negative_Money_Flow > 47.4817 )
		if( Negative_Money_Flow <= 65460.3 )
			if( bullPower <= -0.048499 )
				if( Positive_Money_Flow_Sum <= 2.76602e+07 )
					if( Typical_Price <= 13.9098 )
						if( Positive_Money_Flow_Sum <= 8.83625e+06 )
							if( Raw_Money_Flow <= 46676.3 )
								if( Negative_Money_Flow_Sum <= 3.25631e+07 )
									ret := 0.595194
								if( Negative_Money_Flow_Sum > 3.25631e+07 )
									ret := -0.117647
							if( Raw_Money_Flow > 46676.3 )
								if( bullPower <= -0.174447 )
									ret := 0.842105 // buy
								if( bullPower > -0.174447 )
									ret := 0.035714
						if( Positive_Money_Flow_Sum > 8.83625e+06 )
							if( bearPower <= -0.123579 )
								if( MFI_High <= 11.9069 )
									ret := -0.442857
								if( MFI_High > 11.9069 )
									ret := 0.055556
							if( bearPower > -0.123579 )
								if( Positive_Money_Flow_Sum <= 1.88443e+07 )
									ret := 0.064516
								if( Positive_Money_Flow_Sum > 1.88443e+07 )
									ret := 0.636364
					if( Typical_Price > 13.9098 )
						if( bullPower <= -0.646413 )
							if( Money_Flow_Ratio <= 3.35005 )
								if( Negative_Money_Flow_Sum <= 1.95157e+07 )
									ret := 0.677686
								if( Negative_Money_Flow_Sum > 1.95157e+07 )
									ret := 0.111111
							if( Money_Flow_Ratio > 3.35005 )
								if( Raw_Money_Flow <= 49385.5 )
									ret := -0.722222 // sell
								if( Raw_Money_Flow > 49385.5 )
									ret := 1.000000 // buy
						if( bullPower > -0.646413 )
							if( MFI_High <= -65.2274 )
								if( bearPower <= -0.065404 )
									ret := 0.276025
								if( bearPower > -0.065404 )
									ret := -0.500000
							if( MFI_High > -65.2274 )
								if( MFI_Low <= 28.3984 )
									ret := 0.022388
								if( MFI_Low > 28.3984 )
									ret := 0.228571
				if( Positive_Money_Flow_Sum > 2.76602e+07 )
					if( Positive_Money_Flow_Sum <= 1.87008e+08 )
						if( Negative_Money_Flow_Sum <= 1.29269e+07 )
							if( MFI_High <= 19.6855 )
								if( Typical_Price <= 20.3342 )
									ret := 0.100000
								if( Typical_Price > 20.3342 )
									ret := 0.783333 // buy
							if( MFI_High > 19.6855 )
								if( Positive_Money_Flow_Sum <= 4.4802e+07 )
									ret := -0.888889 // sell
								if( Positive_Money_Flow_Sum > 4.4802e+07 )
									ret := 0.548387
						if( Negative_Money_Flow_Sum > 1.29269e+07 )
							if( Positive_Money_Flow <= 11.785 )
								if( Negative_Money_Flow_Sum <= 1.63496e+07 )
									ret := -0.240000
								if( Negative_Money_Flow_Sum > 1.63496e+07 )
									ret := 0.313402
							if( Positive_Money_Flow > 11.785 )
								if( Raw_Money_Flow <= 21217.9 )
									ret := 0.868421 // buy
								if( Raw_Money_Flow > 21217.9 )
									ret := 0.320388
					if( Positive_Money_Flow_Sum > 1.87008e+08 )
						if( bbp <= -0.778096 )
							if( Raw_Money_Flow <= 20667.1 )
								ret := -0.750000 // sell
							if( Raw_Money_Flow > 20667.1 )
								ret := -1.000000 // sell
						if( bbp > -0.778096 )
							if( Money_Flow_Ratio <= 8.09882 )
								if( Raw_Money_Flow <= 9354.45 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 9354.45 )
									ret := -0.250000
							if( Money_Flow_Ratio > 8.09882 )
								ret := 1.000000 // buy
			if( bullPower > -0.048499 )
				if( bearPower <= 0.204506 )
					if( bbm <= 0.461379 )
						if( Positive_Money_Flow_Sum <= 2.28038e+06 )
							if( bearPower <= 0.076916 )
								if( Typical_Price <= 26.4378 )
									ret := 0.098231
								if( Typical_Price > 26.4378 )
									ret := -0.074074
							if( bearPower > 0.076916 )
								if( Positive_Money_Flow_Sum <= 1.61712e+06 )
									ret := -0.089552
								if( Positive_Money_Flow_Sum > 1.61712e+06 )
									ret := -0.894737 // sell
						if( Positive_Money_Flow_Sum > 2.28038e+06 )
							if( Positive_Money_Flow_Sum <= 2.14831e+08 )
								if( Positive_Money_Flow_Sum <= 1.03283e+08 )
									ret := 0.128727
								if( Positive_Money_Flow_Sum > 1.03283e+08 )
									ret := 0.511111
							if( Positive_Money_Flow_Sum > 2.14831e+08 )
								if( bearPower <= -0.038805 )
									ret := 0.000000
								if( bearPower > -0.038805 )
									ret := -0.785714 // sell
					if( bbm > 0.461379 )
						if( Raw_Money_Flow <= 46274.4 )
							if( bearPower <= -0.183212 )
								if( bbp <= -0.231761 )
									ret := 0.600000
								if( bbp > -0.231761 )
									ret := 1.000000 // buy
							if( bearPower > -0.183212 )
								if( Typical_Price <= 34.0427 )
									ret := -0.500000
								if( Typical_Price > 34.0427 )
									ret := 0.875000 // buy
						if( Raw_Money_Flow > 46274.4 )
							if( bearPower <= -0.469082 )
								if( Typical_Price <= 49.6581 )
									ret := -0.750000 // sell
								if( Typical_Price > 49.6581 )
									ret := -0.250000
							if( bearPower > -0.469082 )
								if( Negative_Money_Flow_Sum <= 325656 )
									ret := -0.285714
								if( Negative_Money_Flow_Sum > 325656 )
									ret := 0.526316
				if( bearPower > 0.204506 )
					if( Raw_Money_Flow <= 166714 )
						if( bearPower <= 0.338083 )
							if( Typical_Price <= 60.1209 )
								if( Positive_Money_Flow_Sum <= 3.90251e+07 )
									ret := -0.077739
								if( Positive_Money_Flow_Sum > 3.90251e+07 )
									ret := -0.388889
							if( Typical_Price > 60.1209 )
								if( Typical_Price <= 70.835 )
									ret := 0.620690
								if( Typical_Price > 70.835 )
									ret := -0.090909
						if( bearPower > 0.338083 )
							if( Positive_Money_Flow <= 2.72607 )
								if( bearPower <= 0.765384 )
									ret := -0.091603
								if( bearPower > 0.765384 )
									ret := -0.500000
							if( Positive_Money_Flow > 2.72607 )
								if( Money_Flow_Ratio <= 585.223 )
									ret := -0.681818
								if( Money_Flow_Ratio > 585.223 )
									ret := 1.000000 // buy
					if( Raw_Money_Flow > 166714 )
						if( MFI <= 92.2397 )
							if( MFI_Low <= 60.9084 )
								if( MFI <= 65.3221 )
									ret := 0.428571
								if( MFI > 65.3221 )
									ret := 1.000000 // buy
							if( MFI_Low > 60.9084 )
								if( BBPower_Color <= 0.5 )
									ret := 0.200000
								if( BBPower_Color > 0.5 )
									ret := -1.000000 // sell
						if( MFI > 92.2397 )
							ret := 1.000000 // buy
		if( Negative_Money_Flow > 65460.3 )
			if( Negative_Money_Flow <= 4.72228e+07 )
				if( Negative_Money_Flow_Sum <= 2.85392e+08 )
					if( Raw_Money_Flow <= 4.1857e+06 )
						if( bearPower <= -1.36824 )
							if( MFI_Low <= 40.3578 )
								if( Typical_Price <= 74.1683 )
									ret := 0.775000 // buy
								if( Typical_Price > 74.1683 )
									ret := 0.333333
							if( MFI_Low > 40.3578 )
								if( Positive_Money_Flow_Sum <= 3.94324e+07 )
									ret := -0.375000
								if( Positive_Money_Flow_Sum > 3.94324e+07 )
									ret := 0.500000
						if( bearPower > -1.36824 )
							if( Negative_Money_Flow_Sum <= 4.9448e+07 )
								if( MFI_High <= 8.79824 )
									ret := 0.052686
								if( MFI_High > 8.79824 )
									ret := 0.261307
							if( Negative_Money_Flow_Sum > 4.9448e+07 )
								if( Negative_Money_Flow_Sum <= 2.39427e+08 )
									ret := 0.199555
								if( Negative_Money_Flow_Sum > 2.39427e+08 )
									ret := -0.789474 // sell
					if( Raw_Money_Flow > 4.1857e+06 )
						if( MFI_High <= -78.4435 )
							if( Negative_Money_Flow_Sum <= 5.32676e+07 )
								if( bearPower <= -0.825893 )
									ret := -0.140496
								if( bearPower > -0.825893 )
									ret := 0.222000
							if( Negative_Money_Flow_Sum > 5.32676e+07 )
								if( bullPower <= -0.580815 )
									ret := 0.254545
								if( bullPower > -0.580815 )
									ret := 0.730769 // buy
						if( MFI_High > -78.4435 )
							if( bearPower <= 0.554495 )
								if( bearPower <= -2.8654 )
									ret := 0.666667
								if( bearPower > -2.8654 )
									ret := -0.006185
							if( bearPower > 0.554495 )
								if( Negative_Money_Flow_Sum <= 5.19256e+07 )
									ret := 0.085106
								if( Negative_Money_Flow_Sum > 5.19256e+07 )
									ret := 0.644444
				if( Negative_Money_Flow_Sum > 2.85392e+08 )
					if( Typical_Price <= 64.715 )
						if( MFI <= 5.34111 )
							ret := 0.250000
						if( MFI > 5.34111 )
							if( MFI_High <= -69.8352 )
								ret := 1.000000 // buy
							if( MFI_High > -69.8352 )
								if( Negative_Money_Flow <= 1.32571e+07 )
									ret := 0.142857
								if( Negative_Money_Flow > 1.32571e+07 )
									ret := 0.962963 // buy
					if( Typical_Price > 64.715 )
						if( Money_Flow_Ratio <= 0.072206 )
							ret := 0.500000
						if( Money_Flow_Ratio > 0.072206 )
							ret := -0.200000
			if( Negative_Money_Flow > 4.72228e+07 )
				if( bullPower <= -0.524455 )
					if( bbp <= -5.38648 )
						ret := -1.000000 // sell
					if( bbp > -5.38648 )
						if( bullPower <= -0.723051 )
							ret := 0.000000
						if( bullPower > -0.723051 )
							ret := -0.600000
				if( bullPower > -0.524455 )
					if( bbp <= 1.81824 )
						if( Positive_Money_Flow_Sum <= 4.42497e+07 )
							if( MFI_Low <= -18.5212 )
								ret := 0.142857
							if( MFI_Low > -18.5212 )
								if( Negative_Money_Flow <= 7.99934e+07 )
									ret := 0.861538 // buy
								if( Negative_Money_Flow > 7.99934e+07 )
									ret := 0.450000
						if( Positive_Money_Flow_Sum > 4.42497e+07 )
							if( Positive_Money_Flow_Sum <= 3.06961e+08 )
								if( Raw_Money_Flow <= 1.2546e+08 )
									ret := -0.090909
								if( Raw_Money_Flow > 1.2546e+08 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 3.06961e+08 )
								ret := 0.857143 // buy
					if( bbp > 1.81824 )
						if( Typical_Price <= 64.3183 )
							ret := -1.000000 // sell
						if( Typical_Price > 64.3183 )
							ret := 0.400000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_RUN_15Min_0385a842(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


