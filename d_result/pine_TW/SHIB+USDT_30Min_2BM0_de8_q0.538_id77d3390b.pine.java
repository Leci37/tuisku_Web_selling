//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: SHIBUSDT_30Min_2BM0_77d3390b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_30Min_2BM0_77d3390b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_30Min_77d3390b(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( MFI <= 27.7645 )
		if( Negative_Money_Flow_Sum <= 1.38171e+07 )
			if( Negative_Money_Flow <= 299076 )
				if( Positive_Money_Flow_Sum <= 2.6986e+06 )
					if( Positive_Money_Flow <= 139590 )
						if( Raw_Money_Flow <= 205824 )
							if( MFI_High <= -56.8077 )
								if( Negative_Money_Flow_Sum <= 5.23938e+06 )
									ret := 0.097403
								if( Negative_Money_Flow_Sum > 5.23938e+06 )
									ret := -0.230769
							if( MFI_High > -56.8077 )
								if( Negative_Money_Flow_Sum <= 1.86661e+06 )
									ret := -0.231884
								if( Negative_Money_Flow_Sum > 1.86661e+06 )
									ret := 0.012195
						if( Raw_Money_Flow > 205824 )
							if( Negative_Money_Flow_Sum <= 1.23493e+07 )
								if( Negative_Money_Flow_Sum <= 1.08462e+07 )
									ret := -0.193416
								if( Negative_Money_Flow_Sum > 1.08462e+07 )
									ret := 0.666667
							if( Negative_Money_Flow_Sum > 1.23493e+07 )
								if( Typical_Price <= 1.6e-05 )
									ret := -1.000000 // sell
								if( Typical_Price > 1.6e-05 )
									ret := -0.750000 // sell
					if( Positive_Money_Flow > 139590 )
						if( Typical_Price <= 1.8e-05 )
							if( Negative_Money_Flow_Sum <= 1.25223e+07 )
								if( Positive_Money_Flow_Sum <= 2.0651e+06 )
									ret := 0.034642
								if( Positive_Money_Flow_Sum > 2.0651e+06 )
									ret := 0.261538
							if( Negative_Money_Flow_Sum > 1.25223e+07 )
								if( Typical_Price <= 8e-06 )
									ret := 0.000000
								if( Typical_Price > 8e-06 )
									ret := -1.000000 // sell
						if( Typical_Price > 1.8e-05 )
							if( Positive_Money_Flow_Sum <= 2.51889e+06 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 2.51889e+06 )
								ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 2.6986e+06 )
					if( Negative_Money_Flow_Sum <= 1.00065e+07 )
						if( MFI_High <= -54.969 )
							if( Negative_Money_Flow_Sum <= 9.87218e+06 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 9.87218e+06 )
								ret := -0.600000
						if( MFI_High > -54.969 )
							if( Raw_Money_Flow <= 561020 )
								if( Raw_Money_Flow <= 468084 )
									ret := -0.705882 // sell
								if( Raw_Money_Flow > 468084 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 561020 )
								if( Typical_Price <= 1.1e-05 )
									ret := -0.700000 // sell
								if( Typical_Price > 1.1e-05 )
									ret := -0.100000
					if( Negative_Money_Flow_Sum > 1.00065e+07 )
						if( Negative_Money_Flow_Sum <= 1.21542e+07 )
							if( Positive_Money_Flow <= 564190 )
								if( Negative_Money_Flow_Sum <= 1.09429e+07 )
									ret := -0.653846
								if( Negative_Money_Flow_Sum > 1.09429e+07 )
									ret := 0.000000
							if( Positive_Money_Flow > 564190 )
								if( MFI <= 20.9388 )
									ret := -0.571429
								if( MFI > 20.9388 )
									ret := 0.304348
						if( Negative_Money_Flow_Sum > 1.21542e+07 )
							if( MFI_High <= -55.779 )
								if( Positive_Money_Flow <= 672926 )
									ret := -0.192308
								if( Positive_Money_Flow > 672926 )
									ret := -0.725000 // sell
							if( MFI_High > -55.779 )
								if( Raw_Money_Flow <= 989892 )
									ret := -0.368421
								if( Raw_Money_Flow > 989892 )
									ret := 0.250000
			if( Negative_Money_Flow > 299076 )
				if( Negative_Money_Flow_Sum <= 7.51749e+06 )
					if( Negative_Money_Flow_Sum <= 5.1873e+06 )
						if( Negative_Money_Flow_Sum <= 4.29446e+06 )
							if( Positive_Money_Flow_Sum <= 541932 )
								if( Raw_Money_Flow <= 996329 )
									ret := -0.142857
								if( Raw_Money_Flow > 996329 )
									ret := 0.625000
							if( Positive_Money_Flow_Sum > 541932 )
								if( Negative_Money_Flow_Sum <= 4.0481e+06 )
									ret := 0.106061
								if( Negative_Money_Flow_Sum > 4.0481e+06 )
									ret := 0.519231
						if( Negative_Money_Flow_Sum > 4.29446e+06 )
							if( Negative_Money_Flow <= 510361 )
								if( Negative_Money_Flow_Sum <= 4.39025e+06 )
									ret := -0.454545
								if( Negative_Money_Flow_Sum > 4.39025e+06 )
									ret := -0.060000
							if( Negative_Money_Flow > 510361 )
								if( Raw_Money_Flow <= 579608 )
									ret := 0.333333
								if( Raw_Money_Flow > 579608 )
									ret := 0.016949
					if( Negative_Money_Flow_Sum > 5.1873e+06 )
						if( Money_Flow_Ratio <= 0.378104 )
							if( Positive_Money_Flow_Sum <= 2.46882e+06 )
								if( Negative_Money_Flow_Sum <= 7.01277e+06 )
									ret := 0.303030
								if( Negative_Money_Flow_Sum > 7.01277e+06 )
									ret := 0.557692
							if( Positive_Money_Flow_Sum > 2.46882e+06 )
								if( Negative_Money_Flow <= 1.70892e+06 )
									ret := 0.125000
								if( Negative_Money_Flow > 1.70892e+06 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.378104 )
							if( Money_Flow_Ratio <= 0.382108 )
								ret := 0.714286 // buy
							if( Money_Flow_Ratio > 0.382108 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 7.51749e+06 )
					if( MFI_Low <= -0.319827 )
						if( MFI_Low <= -4.92718 )
							if( Typical_Price <= 1.4e-05 )
								if( Typical_Price <= 7e-06 )
									ret := 0.846154 // buy
								if( Typical_Price > 7e-06 )
									ret := 0.042373
							if( Typical_Price > 1.4e-05 )
								if( MFI_High <= -67.6296 )
									ret := 0.000000
								if( MFI_High > -67.6296 )
									ret := -0.826087 // sell
						if( MFI_Low > -4.92718 )
							if( Raw_Money_Flow <= 475431 )
								if( Negative_Money_Flow_Sum <= 1.03294e+07 )
									ret := -0.428571
								if( Negative_Money_Flow_Sum > 1.03294e+07 )
									ret := 0.200000
							if( Raw_Money_Flow > 475431 )
								if( Raw_Money_Flow <= 620228 )
									ret := 0.875000 // buy
								if( Raw_Money_Flow > 620228 )
									ret := 0.404908
					if( MFI_Low > -0.319827 )
						if( Negative_Money_Flow_Sum <= 8.21001e+06 )
							if( Negative_Money_Flow <= 2.19864e+06 )
								if( Raw_Money_Flow <= 1.63985e+06 )
									ret := -0.360000
								if( Raw_Money_Flow > 1.63985e+06 )
									ret := 0.142857
							if( Negative_Money_Flow > 2.19864e+06 )
								if( MFI <= 26.4522 )
									ret := -0.750000 // sell
								if( MFI > 26.4522 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 8.21001e+06 )
							if( Negative_Money_Flow_Sum <= 1.01523e+07 )
								if( MFI_Low <= 6.64697 )
									ret := 0.325581
								if( MFI_Low > 6.64697 )
									ret := -0.428571
							if( Negative_Money_Flow_Sum > 1.01523e+07 )
								if( Positive_Money_Flow_Sum <= 3.73433e+06 )
									ret := -0.323741
								if( Positive_Money_Flow_Sum > 3.73433e+06 )
									ret := 0.121693
		if( Negative_Money_Flow_Sum > 1.38171e+07 )
			if( Positive_Money_Flow <= 3.2678e+06 )
				if( Typical_Price <= 3e-05 )
					if( Negative_Money_Flow_Sum <= 7.16973e+07 )
						if( Positive_Money_Flow_Sum <= 2.81516e+06 )
							if( Negative_Money_Flow_Sum <= 1.71463e+07 )
								if( Negative_Money_Flow_Sum <= 1.69675e+07 )
									ret := 0.225806
								if( Negative_Money_Flow_Sum > 1.69675e+07 )
									ret := -0.714286 // sell
							if( Negative_Money_Flow_Sum > 1.71463e+07 )
								if( Typical_Price <= 1.6e-05 )
									ret := 0.883495 // buy
								if( Typical_Price > 1.6e-05 )
									ret := -0.117647
						if( Positive_Money_Flow_Sum > 2.81516e+06 )
							if( Positive_Money_Flow_Sum <= 6.57148e+06 )
								if( Typical_Price <= 2.6e-05 )
									ret := 0.175273
								if( Typical_Price > 2.6e-05 )
									ret := -0.846154 // sell
							if( Positive_Money_Flow_Sum > 6.57148e+06 )
								if( Negative_Money_Flow_Sum <= 6.97771e+07 )
									ret := 0.323392
								if( Negative_Money_Flow_Sum > 6.97771e+07 )
									ret := -0.409091
					if( Negative_Money_Flow_Sum > 7.16973e+07 )
						if( bullPower <= -1e-06 )
							ret := 1.000000 // buy
						if( bullPower > -1e-06 )
							if( Negative_Money_Flow_Sum <= 8.895e+07 )
								if( MFI <= 7.81326 )
									ret := -0.333333
								if( MFI > 7.81326 )
									ret := 0.699029
							if( Negative_Money_Flow_Sum > 8.895e+07 )
								if( Positive_Money_Flow_Sum <= 3.66768e+07 )
									ret := 0.238342
								if( Positive_Money_Flow_Sum > 3.66768e+07 )
									ret := 0.651685
				if( Typical_Price > 3e-05 )
					if( Negative_Money_Flow_Sum <= 2.55786e+08 )
						if( Raw_Money_Flow <= 1.6807e+06 )
							if( Negative_Money_Flow <= 1.49294e+06 )
								ret := -0.500000
							if( Negative_Money_Flow > 1.49294e+06 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 1.6807e+06 )
							if( Negative_Money_Flow_Sum <= 1.89069e+08 )
								if( Positive_Money_Flow_Sum <= 5.53701e+07 )
									ret := -0.017937
								if( Positive_Money_Flow_Sum > 5.53701e+07 )
									ret := 0.916667 // buy
							if( Negative_Money_Flow_Sum > 1.89069e+08 )
								if( Negative_Money_Flow <= 3.7496e+07 )
									ret := -0.718750 // sell
								if( Negative_Money_Flow > 3.7496e+07 )
									ret := 0.111111
					if( Negative_Money_Flow_Sum > 2.55786e+08 )
						if( bbp <= -1e-05 )
							ret := -0.857143 // sell
						if( bbp > -1e-05 )
							if( Raw_Money_Flow <= 5.07332e+07 )
								if( Positive_Money_Flow_Sum <= 7.22406e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 7.22406e+07 )
									ret := 0.692308
							if( Raw_Money_Flow > 5.07332e+07 )
								if( bbp <= -4e-06 )
									ret := 0.461538
								if( bbp > -4e-06 )
									ret := -1.000000 // sell
			if( Positive_Money_Flow > 3.2678e+06 )
				if( Negative_Money_Flow_Sum <= 1.30589e+08 )
					if( MFI_High <= -57.2095 )
						if( MFI <= 9.7869 )
							ret := 1.000000 // buy
						if( MFI > 9.7869 )
							if( Typical_Price <= 7e-06 )
								ret := 0.500000
							if( Typical_Price > 7e-06 )
								if( Negative_Money_Flow_Sum <= 3.09988e+07 )
									ret := 0.400000
								if( Negative_Money_Flow_Sum > 3.09988e+07 )
									ret := -0.582677
					if( MFI_High > -57.2095 )
						if( Typical_Price <= 1.1e-05 )
							if( Negative_Money_Flow_Sum <= 4.37825e+07 )
								if( Negative_Money_Flow_Sum <= 3.99145e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 3.99145e+07 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 4.37825e+07 )
								if( Positive_Money_Flow <= 5.2487e+06 )
									ret := 0.400000
								if( Positive_Money_Flow > 5.2487e+06 )
									ret := 1.000000 // buy
						if( Typical_Price > 1.1e-05 )
							if( Typical_Price <= 2.9e-05 )
								if( Positive_Money_Flow_Sum <= 1.34453e+07 )
									ret := 0.142857
								if( Positive_Money_Flow_Sum > 1.34453e+07 )
									ret := -0.411765
							if( Typical_Price > 2.9e-05 )
								if( Positive_Money_Flow <= 1.19658e+07 )
									ret := 0.379310
								if( Positive_Money_Flow > 1.19658e+07 )
									ret := -0.750000 // sell
				if( Negative_Money_Flow_Sum > 1.30589e+08 )
					if( Positive_Money_Flow_Sum <= 9.12603e+07 )
						if( MFI_Low <= 0.184259 )
							if( bullPower <= -1e-06 )
								ret := -0.750000 // sell
							if( bullPower > -1e-06 )
								ret := 0.250000
						if( MFI_Low > 0.184259 )
							if( Money_Flow_Ratio <= 0.359076 )
								if( Typical_Price <= 1.8e-05 )
									ret := 0.000000
								if( Typical_Price > 1.8e-05 )
									ret := 0.915493 // buy
							if( Money_Flow_Ratio > 0.359076 )
								if( bullPower <= -0 )
									ret := 0.142857
								if( bullPower > -0 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 9.12603e+07 )
						if( bbm <= 1e-06 )
							if( Positive_Money_Flow_Sum <= 1.5774e+08 )
								if( bbp <= -2e-06 )
									ret := -0.750000 // sell
								if( bbp > -2e-06 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 1.5774e+08 )
								ret := -0.857143 // sell
						if( bbm > 1e-06 )
							if( MFI_Low <= 5.1037 )
								ret := -0.500000
							if( MFI_Low > 5.1037 )
								if( Negative_Money_Flow <= 1.84078e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 1.84078e+06 )
									ret := 1.000000 // buy
	if( MFI > 27.7645 )
		if( MFI_Low <= 62.8368 )
			if( Negative_Money_Flow_Sum <= 1.47174e+08 )
				if( Negative_Money_Flow_Sum <= 6.09535e+07 )
					if( Raw_Money_Flow <= 1.81443e+07 )
						if( MFI_Low <= 42.4219 )
							if( Negative_Money_Flow <= 1.74937e+06 )
								if( Positive_Money_Flow_Sum <= 3.6532e+07 )
									ret := 0.013440
								if( Positive_Money_Flow_Sum > 3.6532e+07 )
									ret := 0.126486
							if( Negative_Money_Flow > 1.74937e+06 )
								if( Negative_Money_Flow_Sum <= 6.57503e+06 )
									ret := -0.291925
								if( Negative_Money_Flow_Sum > 6.57503e+06 )
									ret := 0.094236
						if( MFI_Low > 42.4219 )
							if( Positive_Money_Flow_Sum <= 4.93751e+07 )
								if( Negative_Money_Flow <= 1.97766e+06 )
									ret := 0.079895
								if( Negative_Money_Flow > 1.97766e+06 )
									ret := 0.215035
							if( Positive_Money_Flow_Sum > 4.93751e+07 )
								if( Negative_Money_Flow_Sum <= 4.82726e+07 )
									ret := -0.116279
								if( Negative_Money_Flow_Sum > 4.82726e+07 )
									ret := 0.245968
					if( Raw_Money_Flow > 1.81443e+07 )
						if( Money_Flow_Ratio <= 4.3817 )
							if( Negative_Money_Flow_Sum <= 1.80516e+07 )
								if( Positive_Money_Flow <= 2.65843e+07 )
									ret := 0.086957
								if( Positive_Money_Flow > 2.65843e+07 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.80516e+07 )
								if( Positive_Money_Flow_Sum <= 2.02238e+08 )
									ret := -0.374486
								if( Positive_Money_Flow_Sum > 2.02238e+08 )
									ret := 0.833333 // buy
						if( Money_Flow_Ratio > 4.3817 )
							if( Positive_Money_Flow <= 4.02664e+07 )
								if( bearPower <= 1e-06 )
									ret := 0.857143 // buy
								if( bearPower > 1e-06 )
									ret := 0.250000
							if( Positive_Money_Flow > 4.02664e+07 )
								ret := -0.142857
				if( Negative_Money_Flow_Sum > 6.09535e+07 )
					if( MFI_Low <= 13.8323 )
						if( Typical_Price <= 1.4e-05 )
							if( Negative_Money_Flow_Sum <= 6.23052e+07 )
								ret := 0.200000
							if( Negative_Money_Flow_Sum > 6.23052e+07 )
								if( Negative_Money_Flow <= 2.03883e+07 )
									ret := 0.886792 // buy
								if( Negative_Money_Flow > 2.03883e+07 )
									ret := 0.250000
						if( Typical_Price > 1.4e-05 )
							if( Positive_Money_Flow_Sum <= 5.51223e+07 )
								if( Positive_Money_Flow_Sum <= 4.6315e+07 )
									ret := 0.206186
								if( Positive_Money_Flow_Sum > 4.6315e+07 )
									ret := -0.228916
							if( Positive_Money_Flow_Sum > 5.51223e+07 )
								if( Negative_Money_Flow <= 1.60732e+07 )
									ret := 0.617021
								if( Negative_Money_Flow > 1.60732e+07 )
									ret := -0.400000
					if( MFI_Low > 13.8323 )
						if( Typical_Price <= 5.2e-05 )
							if( Positive_Money_Flow <= 8.16508e+07 )
								if( Positive_Money_Flow_Sum <= 9.27847e+07 )
									ret := -0.167674
								if( Positive_Money_Flow_Sum > 9.27847e+07 )
									ret := -0.011429
							if( Positive_Money_Flow > 8.16508e+07 )
								if( MFI_Low <= 57.4923 )
									ret := 0.750000 // buy
								if( MFI_Low > 57.4923 )
									ret := 1.000000 // buy
						if( Typical_Price > 5.2e-05 )
							if( Negative_Money_Flow_Sum <= 1.10423e+08 )
								if( bbp <= 1e-06 )
									ret := 0.000000
								if( bbp > 1e-06 )
									ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 1.10423e+08 )
								if( Raw_Money_Flow <= 2.35568e+07 )
									ret := -0.700000 // sell
								if( Raw_Money_Flow > 2.35568e+07 )
									ret := -0.166667
			if( Negative_Money_Flow_Sum > 1.47174e+08 )
				if( Typical_Price <= 4.5e-05 )
					if( Positive_Money_Flow_Sum <= 1.11392e+08 )
						if( Positive_Money_Flow_Sum <= 8.41417e+07 )
							if( Typical_Price <= 2.3e-05 )
								if( Raw_Money_Flow <= 1.42858e+07 )
									ret := -0.705882 // sell
								if( Raw_Money_Flow > 1.42858e+07 )
									ret := 0.333333
							if( Typical_Price > 2.3e-05 )
								if( Money_Flow_Ratio <= 0.451106 )
									ret := 0.269231
								if( Money_Flow_Ratio > 0.451106 )
									ret := 0.951220 // buy
						if( Positive_Money_Flow_Sum > 8.41417e+07 )
							if( Positive_Money_Flow <= 2.70032e+07 )
								if( Negative_Money_Flow_Sum <= 2.23194e+08 )
									ret := -0.487047
								if( Negative_Money_Flow_Sum > 2.23194e+08 )
									ret := 0.625000
							if( Positive_Money_Flow > 2.70032e+07 )
								if( Negative_Money_Flow_Sum <= 2.51507e+08 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow_Sum > 2.51507e+08 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 1.11392e+08 )
						if( Positive_Money_Flow <= 6.11197e+07 )
							if( bearPower <= 1e-06 )
								if( Positive_Money_Flow_Sum <= 1.72795e+08 )
									ret := 0.620209
								if( Positive_Money_Flow_Sum > 1.72795e+08 )
									ret := 0.315911
							if( bearPower > 1e-06 )
								if( Positive_Money_Flow_Sum <= 9.40231e+08 )
									ret := 0.125000
								if( Positive_Money_Flow_Sum > 9.40231e+08 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow > 6.11197e+07 )
							if( Money_Flow_Ratio <= 2.02597 )
								if( bbp <= 3e-06 )
									ret := -0.116667
								if( bbp > 3e-06 )
									ret := -0.774194 // sell
							if( Money_Flow_Ratio > 2.02597 )
								if( Positive_Money_Flow_Sum <= 1.33847e+09 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 1.33847e+09 )
									ret := -1.000000 // sell
				if( Typical_Price > 4.5e-05 )
					if( Positive_Money_Flow_Sum <= 1.01425e+08 )
						if( MFI_High <= -49.7 )
							if( Negative_Money_Flow_Sum <= 2.10745e+08 )
								if( bbp <= -2e-06 )
									ret := 1.000000 // buy
								if( bbp > -2e-06 )
									ret := 0.166667
							if( Negative_Money_Flow_Sum > 2.10745e+08 )
								if( Positive_Money_Flow_Sum <= 9.57096e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 9.57096e+07 )
									ret := -0.750000 // sell
						if( MFI_High > -49.7 )
							if( Negative_Money_Flow <= 2.07184e+07 )
								if( Raw_Money_Flow <= 1.55017e+07 )
									ret := -0.500000
								if( Raw_Money_Flow > 1.55017e+07 )
									ret := -0.966667 // sell
							if( Negative_Money_Flow > 2.07184e+07 )
								if( bbm <= 2e-06 )
									ret := 0.000000
								if( bbm > 2e-06 )
									ret := -0.857143 // sell
					if( Positive_Money_Flow_Sum > 1.01425e+08 )
						if( Negative_Money_Flow_Sum <= 2.42697e+09 )
							if( Positive_Money_Flow_Sum <= 1.62536e+08 )
								if( Negative_Money_Flow_Sum <= 2.42054e+08 )
									ret := 0.121212
								if( Negative_Money_Flow_Sum > 2.42054e+08 )
									ret := 0.620253
							if( Positive_Money_Flow_Sum > 1.62536e+08 )
								if( Positive_Money_Flow_Sum <= 2.86351e+08 )
									ret := -0.356667
								if( Positive_Money_Flow_Sum > 2.86351e+08 )
									ret := 0.002899
						if( Negative_Money_Flow_Sum > 2.42697e+09 )
							if( Raw_Money_Flow <= 3.18027e+08 )
								ret := 1.000000 // buy
							if( Raw_Money_Flow > 3.18027e+08 )
								ret := 0.000000
		if( MFI_Low > 62.8368 )
			if( Raw_Money_Flow <= 2.29342e+06 )
				if( Positive_Money_Flow_Sum <= 3.27927e+07 )
					if( Positive_Money_Flow_Sum <= 1.51522e+07 )
						if( Typical_Price <= 1.4e-05 )
							if( Money_Flow_Ratio <= 10.1788 )
								if( Positive_Money_Flow <= 276805 )
									ret := -0.022388
								if( Positive_Money_Flow > 276805 )
									ret := 0.216000
							if( Money_Flow_Ratio > 10.1788 )
								if( MFI_High <= 11.0036 )
									ret := -1.000000 // sell
								if( MFI_High > 11.0036 )
									ret := -0.166667
						if( Typical_Price > 1.4e-05 )
							if( Negative_Money_Flow_Sum <= 2.20799e+06 )
								if( MFI <= 86.4511 )
									ret := 0.055556
								if( MFI > 86.4511 )
									ret := -0.533333
							if( Negative_Money_Flow_Sum > 2.20799e+06 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.51522e+07 )
						if( Positive_Money_Flow_Sum <= 1.59284e+07 )
							if( Positive_Money_Flow <= 532142 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 532142 )
								ret := 0.000000
						if( Positive_Money_Flow_Sum > 1.59284e+07 )
							if( Raw_Money_Flow <= 1.57621e+06 )
								if( Typical_Price <= 1.1e-05 )
									ret := -0.354839
								if( Typical_Price > 1.1e-05 )
									ret := 0.257143
							if( Raw_Money_Flow > 1.57621e+06 )
								if( Raw_Money_Flow <= 1.94369e+06 )
									ret := -0.666667
								if( Raw_Money_Flow > 1.94369e+06 )
									ret := -0.076923
				if( Positive_Money_Flow_Sum > 3.27927e+07 )
					if( Money_Flow_Ratio <= 7.31895 )
						if( MFI_Low <= 63.8301 )
							ret := 0.250000
						if( MFI_Low > 63.8301 )
							if( Negative_Money_Flow_Sum <= 7.08856e+06 )
								if( Positive_Money_Flow <= 2.0152e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 2.0152e+06 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 7.08856e+06 )
								ret := 0.500000
					if( Money_Flow_Ratio > 7.31895 )
						if( Typical_Price <= 1.2e-05 )
							ret := 0.250000
						if( Typical_Price > 1.2e-05 )
							ret := -0.800000 // sell
			if( Raw_Money_Flow > 2.29342e+06 )
				if( Positive_Money_Flow_Sum <= 3.47963e+07 )
					if( Positive_Money_Flow_Sum <= 2.69597e+07 )
						if( Negative_Money_Flow_Sum <= 4.58535e+06 )
							if( Positive_Money_Flow <= 5.33438e+06 )
								if( Raw_Money_Flow <= 2.98705e+06 )
									ret := -0.514286
								if( Raw_Money_Flow > 2.98705e+06 )
									ret := -0.023529
							if( Positive_Money_Flow > 5.33438e+06 )
								if( Typical_Price <= 1.3e-05 )
									ret := -0.741935 // sell
								if( Typical_Price > 1.3e-05 )
									ret := -0.176471
						if( Negative_Money_Flow_Sum > 4.58535e+06 )
							if( Negative_Money_Flow_Sum <= 4.90545e+06 )
								if( Typical_Price <= 1e-05 )
									ret := 1.000000 // buy
								if( Typical_Price > 1e-05 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 4.90545e+06 )
								ret := -0.166667
					if( Positive_Money_Flow_Sum > 2.69597e+07 )
						if( MFI_High <= 4.32337 )
							if( bullPower <= 1e-06 )
								if( Positive_Money_Flow <= 3.68458e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 3.68458e+06 )
									ret := -0.285714
							if( bullPower > 1e-06 )
								ret := 0.714286 // buy
						if( MFI_High > 4.32337 )
							if( Positive_Money_Flow <= 2.38428e+06 )
								ret := -0.250000
							if( Positive_Money_Flow > 2.38428e+06 )
								if( Positive_Money_Flow <= 1.05581e+07 )
									ret := -0.888889 // sell
								if( Positive_Money_Flow > 1.05581e+07 )
									ret := -0.428571
				if( Positive_Money_Flow_Sum > 3.47963e+07 )
					if( Typical_Price <= 2e-05 )
						if( Negative_Money_Flow_Sum <= 2.57444e+07 )
							if( Negative_Money_Flow_Sum <= 8.06292e+06 )
								if( Money_Flow_Ratio <= 7.29262 )
									ret := 0.603774
								if( Money_Flow_Ratio > 7.29262 )
									ret := -0.054348
							if( Negative_Money_Flow_Sum > 8.06292e+06 )
								if( Negative_Money_Flow <= 4.00974e+06 )
									ret := -0.449275
								if( Negative_Money_Flow > 4.00974e+06 )
									ret := 0.320000
						if( Negative_Money_Flow_Sum > 2.57444e+07 )
							if( Positive_Money_Flow_Sum <= 2.40857e+08 )
								if( MFI_High <= 3.417 )
									ret := 0.000000
								if( MFI_High > 3.417 )
									ret := 0.950000 // buy
							if( Positive_Money_Flow_Sum > 2.40857e+08 )
								if( Positive_Money_Flow <= 7.07635e+07 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow > 7.07635e+07 )
									ret := 0.000000
					if( Typical_Price > 2e-05 )
						if( MFI_High <= 5.28277 )
							if( MFI_High <= 3.60709 )
								if( bbp <= 5e-06 )
									ret := -0.264706
								if( bbp > 5e-06 )
									ret := -1.000000 // sell
							if( MFI_High > 3.60709 )
								if( Positive_Money_Flow <= 1.07774e+08 )
									ret := -0.095238
								if( Positive_Money_Flow > 1.07774e+08 )
									ret := 0.818182 // buy
						if( MFI_High > 5.28277 )
							if( bullPower <= 4e-06 )
								if( Raw_Money_Flow <= 1.29357e+08 )
									ret := -0.506494
								if( Raw_Money_Flow > 1.29357e+08 )
									ret := 0.818182 // buy
							if( bullPower > 4e-06 )
								if( MFI_High <= 5.93135 )
									ret := 0.000000
								if( MFI_High > 5.93135 )
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
float op_operation = decision_tree_0_SHIBUSDT_30Min_77d3390b(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


