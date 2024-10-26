//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: SNAP_1Min_1M00_89a2ccf2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_1M00_89a2ccf2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_89a2ccf2(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 0.477409 )
		if( Negative_Money_Flow_Sum <= 385861 )
			if( Positive_Money_Flow <= 22.2035 )
				if( MFI_Low <= 4.17322 )
					if( Typical_Price <= 13.65 )
						if( Negative_Money_Flow_Sum <= 123756 )
							if( Positive_Money_Flow_Sum <= 5963.81 )
								if( MFI <= 10.7354 )
									ret := 0.000000
								if( MFI > 10.7354 )
									ret := 0.250000
							if( Positive_Money_Flow_Sum > 5963.81 )
								if( Negative_Money_Flow_Sum <= 34821.2 )
									ret := 0.923077 // buy
								if( Negative_Money_Flow_Sum > 34821.2 )
									ret := 0.447154
						if( Negative_Money_Flow_Sum > 123756 )
							if( Typical_Price <= 12.9414 )
								if( Raw_Money_Flow <= 1144.2 )
									ret := -0.416667
								if( Raw_Money_Flow > 1144.2 )
									ret := 0.171717
							if( Typical_Price > 12.9414 )
								ret := 0.750000 // buy
					if( Typical_Price > 13.65 )
						if( Negative_Money_Flow_Sum <= 291595 )
							if( Positive_Money_Flow_Sum <= 5287.26 )
								if( Typical_Price <= 15.4559 )
									ret := -1.000000 // sell
								if( Typical_Price > 15.4559 )
									ret := -0.166667
							if( Positive_Money_Flow_Sum > 5287.26 )
								if( Raw_Money_Flow <= 32348.4 )
									ret := 0.104651
								if( Raw_Money_Flow > 32348.4 )
									ret := -0.600000
						if( Negative_Money_Flow_Sum > 291595 )
							if( Typical_Price <= 15.8 )
								ret := -1.000000 // sell
							if( Typical_Price > 15.8 )
								ret := -0.333333
				if( MFI_Low > 4.17322 )
					if( Typical_Price <= 8.71878 )
						if( MFI_Low <= 78.6963 )
							if( MFI_Low <= 11.1928 )
								if( Negative_Money_Flow_Sum <= 56989.8 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 56989.8 )
									ret := -0.166667
							if( MFI_Low > 11.1928 )
								if( Raw_Money_Flow <= 70212.6 )
									ret := -0.045977
								if( Raw_Money_Flow > 70212.6 )
									ret := -0.750000 // sell
						if( MFI_Low > 78.6963 )
							if( Raw_Money_Flow <= 4132.74 )
								ret := -0.714286 // sell
							if( Raw_Money_Flow > 4132.74 )
								ret := -1.000000 // sell
					if( Typical_Price > 8.71878 )
						if( Typical_Price <= 15.135 )
							if( Raw_Money_Flow <= 10225.9 )
								if( MFI_High <= -51.5294 )
									ret := 0.304348
								if( MFI_High > -51.5294 )
									ret := -0.004556
							if( Raw_Money_Flow > 10225.9 )
								if( Typical_Price <= 11.8327 )
									ret := 0.073944
								if( Typical_Price > 11.8327 )
									ret := 0.355372
						if( Typical_Price > 15.135 )
							if( Positive_Money_Flow_Sum <= 18356.7 )
								if( Positive_Money_Flow_Sum <= 14703.6 )
									ret := -0.076923
								if( Positive_Money_Flow_Sum > 14703.6 )
									ret := -0.666667
							if( Positive_Money_Flow_Sum > 18356.7 )
								if( Positive_Money_Flow_Sum <= 19485.1 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 19485.1 )
									ret := -0.064103
			if( Positive_Money_Flow > 22.2035 )
				if( Money_Flow_Ratio <= 1.45619 )
					if( Positive_Money_Flow <= 115089 )
						if( Typical_Price <= 11.6269 )
							if( Negative_Money_Flow_Sum <= 134598 )
								if( Positive_Money_Flow_Sum <= 138281 )
									ret := 0.017216
								if( Positive_Money_Flow_Sum > 138281 )
									ret := 0.636364
							if( Negative_Money_Flow_Sum > 134598 )
								if( Positive_Money_Flow_Sum <= 113701 )
									ret := -0.066298
								if( Positive_Money_Flow_Sum > 113701 )
									ret := -0.259843
						if( Typical_Price > 11.6269 )
							if( Positive_Money_Flow <= 21943.1 )
								if( Positive_Money_Flow_Sum <= 16665 )
									ret := 0.085366
								if( Positive_Money_Flow_Sum > 16665 )
									ret := -0.232681
							if( Positive_Money_Flow > 21943.1 )
								if( Negative_Money_Flow_Sum <= 278885 )
									ret := -0.120805
								if( Negative_Money_Flow_Sum > 278885 )
									ret := 0.425532
					if( Positive_Money_Flow > 115089 )
						if( Positive_Money_Flow <= 170789 )
							if( Typical_Price <= 10.8283 )
								ret := 0.166667
							if( Typical_Price > 10.8283 )
								if( Typical_Price <= 15.06 )
									ret := 1.000000 // buy
								if( Typical_Price > 15.06 )
									ret := 0.500000
						if( Positive_Money_Flow > 170789 )
							if( Typical_Price <= 14.1983 )
								ret := -0.750000 // sell
							if( Typical_Price > 14.1983 )
								ret := 0.000000
				if( Money_Flow_Ratio > 1.45619 )
					if( Raw_Money_Flow <= 2.06118e+06 )
						if( Positive_Money_Flow_Sum <= 1.05896e+06 )
							if( Positive_Money_Flow <= 347282 )
								if( MFI_Low <= 39.3473 )
									ret := -0.933333 // sell
								if( MFI_Low > 39.3473 )
									ret := -0.224665
							if( Positive_Money_Flow > 347282 )
								if( MFI_Low <= 70.0979 )
									ret := -0.827586 // sell
								if( MFI_Low > 70.0979 )
									ret := -0.400000
						if( Positive_Money_Flow_Sum > 1.05896e+06 )
							if( Positive_Money_Flow_Sum <= 5.00291e+06 )
								if( Positive_Money_Flow <= 290452 )
									ret := -0.145455
								if( Positive_Money_Flow > 290452 )
									ret := 0.190476
							if( Positive_Money_Flow_Sum > 5.00291e+06 )
								if( MFI_Low <= 74.8802 )
									ret := 0.461538
								if( MFI_Low > 74.8802 )
									ret := -0.376471
					if( Raw_Money_Flow > 2.06118e+06 )
						if( Positive_Money_Flow_Sum <= 5.27542e+06 )
							if( Raw_Money_Flow <= 3.15958e+06 )
								if( Negative_Money_Flow_Sum <= 138385 )
									ret := -0.821429 // sell
								if( Negative_Money_Flow_Sum > 138385 )
									ret := -0.285714
							if( Raw_Money_Flow > 3.15958e+06 )
								if( Typical_Price <= 15.197 )
									ret := -0.222222
								if( Typical_Price > 15.197 )
									ret := 0.857143 // buy
						if( Positive_Money_Flow_Sum > 5.27542e+06 )
							if( Positive_Money_Flow <= 1.28454e+07 )
								if( Money_Flow_Ratio <= 37.4006 )
									ret := -0.500000
								if( Money_Flow_Ratio > 37.4006 )
									ret := -0.906977 // sell
							if( Positive_Money_Flow > 1.28454e+07 )
								if( Typical_Price <= 13.2713 )
									ret := 0.250000
								if( Typical_Price > 13.2713 )
									ret := -0.500000
		if( Negative_Money_Flow_Sum > 385861 )
			if( MFI <= 64.8219 )
				if( Money_Flow_Ratio <= 0.223192 )
					if( Positive_Money_Flow <= 1.68778e+06 )
						if( Positive_Money_Flow_Sum <= 754670 )
							if( Negative_Money_Flow_Sum <= 4.67338e+07 )
								if( Negative_Money_Flow_Sum <= 1.5602e+06 )
									ret := 0.077778
								if( Negative_Money_Flow_Sum > 1.5602e+06 )
									ret := -0.109049
							if( Negative_Money_Flow_Sum > 4.67338e+07 )
								if( Negative_Money_Flow_Sum <= 4.7133e+07 )
									ret := 0.956522 // buy
								if( Negative_Money_Flow_Sum > 4.7133e+07 )
									ret := -0.181818
						if( Positive_Money_Flow_Sum > 754670 )
							if( Typical_Price <= 15.1759 )
								if( Positive_Money_Flow_Sum <= 1.50374e+07 )
									ret := -0.372340
								if( Positive_Money_Flow_Sum > 1.50374e+07 )
									ret := 0.833333 // buy
							if( Typical_Price > 15.1759 )
								if( Typical_Price <= 16.3458 )
									ret := 0.067073
								if( Typical_Price > 16.3458 )
									ret := -0.560000
					if( Positive_Money_Flow > 1.68778e+06 )
						if( MFI <= 15.9945 )
							ret := 1.000000 // buy
						if( MFI > 15.9945 )
							if( Positive_Money_Flow_Sum <= 5.46266e+06 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 5.46266e+06 )
								ret := 0.500000
				if( Money_Flow_Ratio > 0.223192 )
					if( Raw_Money_Flow <= 112781 )
						if( Negative_Money_Flow_Sum <= 820390 )
							if( MFI_Low <= 16.2059 )
								if( Negative_Money_Flow_Sum <= 734582 )
									ret := -0.111111
								if( Negative_Money_Flow_Sum > 734582 )
									ret := 0.477273
							if( MFI_Low > 16.2059 )
								if( MFI_High <= -16.6366 )
									ret := -0.330508
								if( MFI_High > -16.6366 )
									ret := 0.100000
						if( Negative_Money_Flow_Sum > 820390 )
							if( Positive_Money_Flow_Sum <= 2.45665e+06 )
								if( Positive_Money_Flow_Sum <= 2.36172e+06 )
									ret := 0.046154
								if( Positive_Money_Flow_Sum > 2.36172e+06 )
									ret := 0.611111
							if( Positive_Money_Flow_Sum > 2.45665e+06 )
								if( Raw_Money_Flow <= 71011.9 )
									ret := -0.050725
								if( Raw_Money_Flow > 71011.9 )
									ret := -0.278539
					if( Raw_Money_Flow > 112781 )
						if( Negative_Money_Flow_Sum <= 2.23727e+06 )
							if( MFI_High <= -45.3716 )
								if( Positive_Money_Flow <= 130197 )
									ret := 0.055556
								if( Positive_Money_Flow > 130197 )
									ret := -0.160714
							if( MFI_High > -45.3716 )
								if( Positive_Money_Flow_Sum <= 1.86917e+06 )
									ret := 0.070025
								if( Positive_Money_Flow_Sum > 1.86917e+06 )
									ret := 0.182447
						if( Negative_Money_Flow_Sum > 2.23727e+06 )
							if( Typical_Price <= 11.1778 )
								if( Positive_Money_Flow_Sum <= 1.68672e+06 )
									ret := -0.140288
								if( Positive_Money_Flow_Sum > 1.68672e+06 )
									ret := 0.013208
							if( Typical_Price > 11.1778 )
								if( Positive_Money_Flow <= 243839 )
									ret := 0.168637
								if( Positive_Money_Flow > 243839 )
									ret := 0.052969
			if( MFI > 64.8219 )
				if( Raw_Money_Flow <= 2.55469e+06 )
					if( Raw_Money_Flow <= 485591 )
						if( Positive_Money_Flow_Sum <= 6.37912e+06 )
							if( MFI <= 90.8872 )
								if( Money_Flow_Ratio <= 3.12267 )
									ret := -0.073828
								if( Money_Flow_Ratio > 3.12267 )
									ret := 0.045075
							if( MFI > 90.8872 )
								if( Positive_Money_Flow_Sum <= 5.22211e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 5.22211e+06 )
									ret := 0.869565 // buy
						if( Positive_Money_Flow_Sum > 6.37912e+06 )
							if( Typical_Price <= 9.22053 )
								if( Positive_Money_Flow_Sum <= 4.97334e+07 )
									ret := -0.603960
								if( Positive_Money_Flow_Sum > 4.97334e+07 )
									ret := 0.833333 // buy
							if( Typical_Price > 9.22053 )
								if( Money_Flow_Ratio <= 4.88635 )
									ret := -0.265169
								if( Money_Flow_Ratio > 4.88635 )
									ret := -0.078947
					if( Raw_Money_Flow > 485591 )
						if( Typical_Price <= 13.1969 )
							if( MFI_Low <= 74.3848 )
								if( Negative_Money_Flow_Sum <= 6.16449e+06 )
									ret := 0.122767
								if( Negative_Money_Flow_Sum > 6.16449e+06 )
									ret := -0.302632
							if( MFI_Low > 74.3848 )
								if( Positive_Money_Flow_Sum <= 1.01932e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.01932e+07 )
									ret := -0.937500 // sell
						if( Typical_Price > 13.1969 )
							if( MFI_High <= 9.40902 )
								if( MFI_High <= 8.10935 )
									ret := -0.050937
								if( MFI_High > 8.10935 )
									ret := -0.577778
							if( MFI_High > 9.40902 )
								if( Negative_Money_Flow_Sum <= 823709 )
									ret := -0.041667
								if( Negative_Money_Flow_Sum > 823709 )
									ret := 0.500000
				if( Raw_Money_Flow > 2.55469e+06 )
					if( MFI_High <= 3.12461 )
						if( Positive_Money_Flow <= 3.11835e+06 )
							if( MFI_High <= -3.41633 )
								if( Positive_Money_Flow <= 2.69011e+06 )
									ret := -0.541667
								if( Positive_Money_Flow > 2.69011e+06 )
									ret := 0.189873
							if( MFI_High > -3.41633 )
								if( Positive_Money_Flow_Sum <= 2.70425e+07 )
									ret := -0.760870 // sell
								if( Positive_Money_Flow_Sum > 2.70425e+07 )
									ret := 0.000000
						if( Positive_Money_Flow > 3.11835e+06 )
							if( Money_Flow_Ratio <= 4.56698 )
								if( Money_Flow_Ratio <= 3.82216 )
									ret := -0.506276
								if( Money_Flow_Ratio > 3.82216 )
									ret := -0.872340 // sell
							if( Money_Flow_Ratio > 4.56698 )
								if( Money_Flow_Ratio <= 7.16003 )
									ret := 0.235294
								if( Money_Flow_Ratio > 7.16003 )
									ret := -1.000000 // sell
					if( MFI_High > 3.12461 )
						if( Positive_Money_Flow_Sum <= 2.28576e+07 )
							if( Positive_Money_Flow <= 1.03062e+07 )
								if( Money_Flow_Ratio <= 10.8542 )
									ret := 0.291667
								if( Money_Flow_Ratio > 10.8542 )
									ret := -0.480769
							if( Positive_Money_Flow > 1.03062e+07 )
								if( Typical_Price <= 12.8127 )
									ret := 0.750000 // buy
								if( Typical_Price > 12.8127 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.28576e+07 )
							if( Typical_Price <= 14.12 )
								if( Positive_Money_Flow_Sum <= 2.81959e+07 )
									ret := -0.875000 // sell
								if( Positive_Money_Flow_Sum > 2.81959e+07 )
									ret := 0.526316
							if( Typical_Price > 14.12 )
								if( Positive_Money_Flow_Sum <= 2.66111e+07 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 2.66111e+07 )
									ret := -0.720930 // sell
	if( Negative_Money_Flow > 0.477409 )
		if( Positive_Money_Flow_Sum <= 151395 )
			if( Negative_Money_Flow <= 3.11906e+06 )
				if( Negative_Money_Flow <= 821.597 )
					if( Raw_Money_Flow <= 7718.2 )
						if( Negative_Money_Flow_Sum <= 184080 )
							if( Negative_Money_Flow_Sum <= 68774.6 )
								if( Typical_Price <= 9.47479 )
									ret := 0.074074
								if( Typical_Price > 9.47479 )
									ret := 0.482993
							if( Negative_Money_Flow_Sum > 68774.6 )
								if( Raw_Money_Flow <= 5602.27 )
									ret := 0.853211 // buy
								if( Raw_Money_Flow > 5602.27 )
									ret := 0.333333
						if( Negative_Money_Flow_Sum > 184080 )
							if( Raw_Money_Flow <= 1868.48 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 1868.48 )
								if( Positive_Money_Flow <= 3163.14 )
									ret := -0.360000
								if( Positive_Money_Flow > 3163.14 )
									ret := 0.600000
					if( Raw_Money_Flow > 7718.2 )
						if( Positive_Money_Flow <= 13306.4 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow > 13306.4 )
							ret := 0.500000
				if( Negative_Money_Flow > 821.597 )
					if( Negative_Money_Flow_Sum <= 47300 )
						if( Typical_Price <= 15.1658 )
							if( Negative_Money_Flow <= 1093.72 )
								if( MFI_High <= -33.0898 )
									ret := 0.482759
								if( MFI_High > -33.0898 )
									ret := -0.100000
							if( Negative_Money_Flow > 1093.72 )
								if( Positive_Money_Flow <= 1115.97 )
									ret := 0.290289
								if( Positive_Money_Flow > 1115.97 )
									ret := 0.826087 // buy
						if( Typical_Price > 15.1658 )
							if( Negative_Money_Flow_Sum <= 29586.7 )
								if( Negative_Money_Flow <= 2560.03 )
									ret := 0.033333
								if( Negative_Money_Flow > 2560.03 )
									ret := 0.434211
							if( Negative_Money_Flow_Sum > 29586.7 )
								if( Positive_Money_Flow_Sum <= 47649.1 )
									ret := -0.213592
								if( Positive_Money_Flow_Sum > 47649.1 )
									ret := 0.094118
					if( Negative_Money_Flow_Sum > 47300 )
						if( Negative_Money_Flow <= 4647.77 )
							if( Negative_Money_Flow_Sum <= 141690 )
								if( Negative_Money_Flow_Sum <= 109569 )
									ret := 0.407317
								if( Negative_Money_Flow_Sum > 109569 )
									ret := 0.733333 // buy
							if( Negative_Money_Flow_Sum > 141690 )
								if( Positive_Money_Flow <= 3175.82 )
									ret := 0.213904
								if( Positive_Money_Flow > 3175.82 )
									ret := 0.567568
						if( Negative_Money_Flow > 4647.77 )
							if( Negative_Money_Flow_Sum <= 3.31342e+06 )
								if( Positive_Money_Flow <= 23.6573 )
									ret := 0.300000
								if( Positive_Money_Flow > 23.6573 )
									ret := -0.183333
							if( Negative_Money_Flow_Sum > 3.31342e+06 )
								if( Negative_Money_Flow_Sum <= 5.0019e+06 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 5.0019e+06 )
									ret := 0.395604
			if( Negative_Money_Flow > 3.11906e+06 )
				if( Negative_Money_Flow_Sum <= 8.35434e+06 )
					ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 8.35434e+06 )
					if( MFI_High <= -79.9583 )
						ret := 0.833333 // buy
					if( MFI_High > -79.9583 )
						ret := 0.000000
		if( Positive_Money_Flow_Sum > 151395 )
			if( Typical_Price <= 15.8603 )
				if( Negative_Money_Flow_Sum <= 266834 )
					if( Negative_Money_Flow_Sum <= 65427.6 )
						if( Typical_Price <= 13.2872 )
							if( Positive_Money_Flow <= 340.157 )
								if( Money_Flow_Ratio <= 6.29265 )
									ret := -0.137931
								if( Money_Flow_Ratio > 6.29265 )
									ret := 0.186047
							if( Positive_Money_Flow > 340.157 )
								if( MFI <= 89.7559 )
									ret := -0.018182
								if( MFI > 89.7559 )
									ret := -1.000000 // sell
						if( Typical_Price > 13.2872 )
							if( Typical_Price <= 15.2089 )
								if( MFI_Low <= 64.8419 )
									ret := 0.122449
								if( MFI_Low > 64.8419 )
									ret := 0.666667
							if( Typical_Price > 15.2089 )
								if( MFI_Low <= 69.7528 )
									ret := 0.157895
								if( MFI_Low > 69.7528 )
									ret := -0.583333
					if( Negative_Money_Flow_Sum > 65427.6 )
						if( Typical_Price <= 13.8667 )
							if( MFI <= 47.446 )
								if( Negative_Money_Flow <= 3764.59 )
									ret := -0.541667
								if( Negative_Money_Flow > 3764.59 )
									ret := 0.350000
							if( MFI > 47.446 )
								if( MFI <= 60.1926 )
									ret := 0.636905
								if( MFI > 60.1926 )
									ret := 0.349929
						if( Typical_Price > 13.8667 )
							if( Positive_Money_Flow <= 7061.35 )
								if( Raw_Money_Flow <= 24825.7 )
									ret := 0.250883
								if( Raw_Money_Flow > 24825.7 )
									ret := -0.015873
							if( Positive_Money_Flow > 7061.35 )
								if( Typical_Price <= 14.4168 )
									ret := -0.846154 // sell
								if( Typical_Price > 14.4168 )
									ret := -0.040000
				if( Negative_Money_Flow_Sum > 266834 )
					if( Negative_Money_Flow_Sum <= 1.30096e+07 )
						if( MFI_High <= -13.5369 )
							if( Negative_Money_Flow <= 4.53517e+06 )
								if( Negative_Money_Flow_Sum <= 293694 )
									ret := -0.328947
								if( Negative_Money_Flow_Sum > 293694 )
									ret := 0.078113
							if( Negative_Money_Flow > 4.53517e+06 )
								if( Raw_Money_Flow <= 8.4427e+06 )
									ret := -0.481481
								if( Raw_Money_Flow > 8.4427e+06 )
									ret := 0.714286 // buy
						if( MFI_High > -13.5369 )
							if( Money_Flow_Ratio <= 6.2932 )
								if( Negative_Money_Flow_Sum <= 2.08867e+06 )
									ret := -0.078218
								if( Negative_Money_Flow_Sum > 2.08867e+06 )
									ret := 0.061684
							if( Money_Flow_Ratio > 6.2932 )
								if( Negative_Money_Flow <= 25488.1 )
									ret := 0.464646
								if( Negative_Money_Flow > 25488.1 )
									ret := 0.107692
					if( Negative_Money_Flow_Sum > 1.30096e+07 )
						if( Positive_Money_Flow_Sum <= 4.00718e+07 )
							if( Negative_Money_Flow_Sum <= 1.46051e+07 )
								if( Raw_Money_Flow <= 829207 )
									ret := 0.178571
								if( Raw_Money_Flow > 829207 )
									ret := 0.610092
							if( Negative_Money_Flow_Sum > 1.46051e+07 )
								if( Negative_Money_Flow_Sum <= 1.71798e+07 )
									ret := -0.046005
								if( Negative_Money_Flow_Sum > 1.71798e+07 )
									ret := 0.268707
						if( Positive_Money_Flow_Sum > 4.00718e+07 )
							if( Typical_Price <= 15.0095 )
								if( Typical_Price <= 14.518 )
									ret := -0.335938
								if( Typical_Price > 14.518 )
									ret := -0.933333 // sell
							if( Typical_Price > 15.0095 )
								if( Negative_Money_Flow <= 47962.5 )
									ret := -0.384615
								if( Negative_Money_Flow > 47962.5 )
									ret := 0.687500
			if( Typical_Price > 15.8603 )
				if( MFI_Low <= 42.1494 )
					if( Typical_Price <= 16.7433 )
						if( Positive_Money_Flow <= 339116 )
							if( Negative_Money_Flow <= 18819.1 )
								if( Typical_Price <= 16.5623 )
									ret := 0.392523
								if( Typical_Price > 16.5623 )
									ret := -0.277778
							if( Negative_Money_Flow > 18819.1 )
								if( MFI <= 17.6718 )
									ret := -0.095406
								if( MFI > 17.6718 )
									ret := 0.053333
						if( Positive_Money_Flow > 339116 )
							if( MFI <= 34.5566 )
								if( Negative_Money_Flow <= 87495.8 )
									ret := -0.500000
								if( Negative_Money_Flow > 87495.8 )
									ret := -1.000000 // sell
							if( MFI > 34.5566 )
								ret := 0.500000
					if( Typical_Price > 16.7433 )
						if( Positive_Money_Flow_Sum <= 3.56699e+06 )
							if( MFI <= 10.2002 )
								if( MFI <= 8.54005 )
									ret := 0.000000
								if( MFI > 8.54005 )
									ret := 1.000000 // buy
							if( MFI > 10.2002 )
								if( Money_Flow_Ratio <= 0.655286 )
									ret := -0.363636
								if( Money_Flow_Ratio > 0.655286 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 3.56699e+06 )
							if( Raw_Money_Flow <= 198004 )
								if( MFI_High <= -36.0023 )
									ret := -0.307692
								if( MFI_High > -36.0023 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 198004 )
								if( Negative_Money_Flow <= 398655 )
									ret := 0.418605
								if( Negative_Money_Flow > 398655 )
									ret := -0.029915
				if( MFI_Low > 42.1494 )
					if( Positive_Money_Flow <= 31125.2 )
						if( MFI <= 82.2971 )
							if( Raw_Money_Flow <= 217111 )
								if( Money_Flow_Ratio <= 4.33003 )
									ret := 0.014388
								if( Money_Flow_Ratio > 4.33003 )
									ret := -0.833333 // sell
							if( Raw_Money_Flow > 217111 )
								if( Negative_Money_Flow_Sum <= 2.63552e+06 )
									ret := -0.311538
								if( Negative_Money_Flow_Sum > 2.63552e+06 )
									ret := -0.137056
						if( MFI > 82.2971 )
							if( Negative_Money_Flow_Sum <= 63184.8 )
								if( Positive_Money_Flow <= 1497.04 )
									ret := -0.228571
								if( Positive_Money_Flow > 1497.04 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 63184.8 )
								if( Typical_Price <= 16.6325 )
									ret := 0.259843
								if( Typical_Price > 16.6325 )
									ret := -0.073171
					if( Positive_Money_Flow > 31125.2 )
						if( Negative_Money_Flow_Sum <= 5.50479e+06 )
							if( Raw_Money_Flow <= 250006 )
								if( Raw_Money_Flow <= 131075 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 131075 )
									ret := -0.500000
							if( Raw_Money_Flow > 250006 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 5.50479e+06 )
							if( Positive_Money_Flow_Sum <= 2.9454e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.9454e+07 )
								ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNAP_1Min_89a2ccf2(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


