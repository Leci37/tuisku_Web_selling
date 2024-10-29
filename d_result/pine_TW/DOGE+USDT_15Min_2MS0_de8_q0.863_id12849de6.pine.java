//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: DOGEUSDT_15Min_2MS0_12849de6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_15Min_2MS0_12849de6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_15Min_12849de6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 49.8886 )
		if( d <= 21.4647 )
			if( Raw_Money_Flow <= 506879 )
				if( d_k <= -6.22988 )
					if( d_k <= -12.724 )
						if( Positive_Money_Flow <= 434852 )
							if( Negative_Money_Flow_Sum <= 4.71115e+06 )
								if( rsi1 <= 40.9558 )
									ret := -0.282353
								if( rsi1 > 40.9558 )
									ret := -0.015748
							if( Negative_Money_Flow_Sum > 4.71115e+06 )
								if( Typical_Price <= 0.063768 )
									ret := -0.666667
								if( Typical_Price > 0.063768 )
									ret := -0.269231
						if( Positive_Money_Flow > 434852 )
							if( MFI <= 35.867 )
								ret := 0.300000
							if( MFI > 35.867 )
								ret := 0.500000
					if( d_k > -12.724 )
						if( rsi1 <= 42.2967 )
							if( MFI_Low <= 19.8927 )
								if( d_k <= -7.92055 )
									ret := -0.430108
								if( d_k > -7.92055 )
									ret := -0.026432
							if( MFI_Low > 19.8927 )
								if( Raw_Money_Flow <= 409989 )
									ret := -0.526502
								if( Raw_Money_Flow > 409989 )
									ret := -0.911765 // sell
						if( rsi1 > 42.2967 )
							if( MFI <= 49.0508 )
								if( MFI_Low <= 23.067 )
									ret := 0.005525
								if( MFI_Low > 23.067 )
									ret := 0.260870
							if( MFI > 49.0508 )
								if( Negative_Money_Flow_Sum <= 2.60015e+06 )
									ret := -0.207006
								if( Negative_Money_Flow_Sum > 2.60015e+06 )
									ret := 0.012048
				if( d_k > -6.22988 )
					if( rsi1 <= 39.8189 )
						if( Raw_Money_Flow <= 162244 )
							if( MFI <= 15.1322 )
								ret := -0.866667 // sell
							if( MFI > 15.1322 )
								if( Positive_Money_Flow_Sum <= 665805 )
									ret := 0.022472
								if( Positive_Money_Flow_Sum > 665805 )
									ret := -0.232349
						if( Raw_Money_Flow > 162244 )
							if( MFI_High <= -52.5685 )
								if( smoothK_k <= 0.093215 )
									ret := 0.109705
								if( smoothK_k > 0.093215 )
									ret := -0.196286
							if( MFI_High > -52.5685 )
								if( rsi1 <= 26.8871 )
									ret := -0.687980
								if( rsi1 > 26.8871 )
									ret := -0.419474
					if( rsi1 > 39.8189 )
						if( MFI <= 55.101 )
							if( Raw_Money_Flow <= 503451 )
								if( Positive_Money_Flow_Sum <= 4.81421e+06 )
									ret := -0.035576
								if( Positive_Money_Flow_Sum > 4.81421e+06 )
									ret := -0.359477
							if( Raw_Money_Flow > 503451 )
								ret := 0.600000
						if( MFI > 55.101 )
							if( d <= 2.29408 )
								if( Typical_Price <= 0.101605 )
									ret := -0.008130
								if( Typical_Price > 0.101605 )
									ret := -0.307692
							if( d > 2.29408 )
								if( rsi1 <= 56.8857 )
									ret := -0.294034
								if( rsi1 > 56.8857 )
									ret := -0.006270
			if( Raw_Money_Flow > 506879 )
				if( Typical_Price <= 0.09314 )
					if( Negative_Money_Flow_Sum <= 9.88482e+06 )
						if( Typical_Price <= 0.069115 )
							if( Negative_Money_Flow <= 2.51896e+06 )
								if( Negative_Money_Flow_Sum <= 1.76063e+06 )
									ret := -0.518072
								if( Negative_Money_Flow_Sum > 1.76063e+06 )
									ret := -0.166392
							if( Negative_Money_Flow > 2.51896e+06 )
								if( rsi1 <= 34.0486 )
									ret := 0.357143
								if( rsi1 > 34.0486 )
									ret := 0.933333 // buy
						if( Typical_Price > 0.069115 )
							if( smoothD_d <= 5.28772 )
								if( rsi1 <= 28.6659 )
									ret := -0.660772
								if( rsi1 > 28.6659 )
									ret := -0.409560
							if( smoothD_d > 5.28772 )
								if( Negative_Money_Flow_Sum <= 2.8351e+06 )
									ret := -0.567164
								if( Negative_Money_Flow_Sum > 2.8351e+06 )
									ret := -0.334829
					if( Negative_Money_Flow_Sum > 9.88482e+06 )
						if( rsi1 <= 39.6493 )
							if( Money_Flow_Ratio <= 0.627648 )
								if( Positive_Money_Flow <= 4.28402e+06 )
									ret := -0.142146
								if( Positive_Money_Flow > 4.28402e+06 )
									ret := 0.690909
							if( Money_Flow_Ratio > 0.627648 )
								if( Raw_Money_Flow <= 6.92255e+06 )
									ret := -0.545872
								if( Raw_Money_Flow > 6.92255e+06 )
									ret := 0.666667
						if( rsi1 > 39.6493 )
							if( MFI_High <= -33.8245 )
								if( Positive_Money_Flow <= 543476 )
									ret := 0.523810
								if( Positive_Money_Flow > 543476 )
									ret := 0.106250
							if( MFI_High > -33.8245 )
								if( Positive_Money_Flow <= 1.15399e+06 )
									ret := 0.090526
								if( Positive_Money_Flow > 1.15399e+06 )
									ret := -0.332215
				if( Typical_Price > 0.09314 )
					if( k <= 16.7137 )
						if( Negative_Money_Flow <= 2.11014e+07 )
							if( Negative_Money_Flow_Sum <= 8.06018e+07 )
								if( rsi1 <= 49.7681 )
									ret := -0.633599
								if( rsi1 > 49.7681 )
									ret := -0.093682
							if( Negative_Money_Flow_Sum > 8.06018e+07 )
								if( Raw_Money_Flow <= 1.17883e+07 )
									ret := -0.067669
								if( Raw_Money_Flow > 1.17883e+07 )
									ret := -0.455556
						if( Negative_Money_Flow > 2.11014e+07 )
							if( Negative_Money_Flow_Sum <= 8.17575e+07 )
								ret := -0.700000 // sell
							if( Negative_Money_Flow_Sum > 8.17575e+07 )
								if( d_k <= -0.42134 )
									ret := -0.266667
								if( d_k > -0.42134 )
									ret := 0.657895
					if( k > 16.7137 )
						if( Positive_Money_Flow_Sum <= 3.4759e+07 )
							if( rsi1 <= 45.5723 )
								if( Positive_Money_Flow_Sum <= 6.60354e+06 )
									ret := -0.378151
								if( Positive_Money_Flow_Sum > 6.60354e+06 )
									ret := -0.630273
							if( rsi1 > 45.5723 )
								if( Negative_Money_Flow <= 545607 )
									ret := -0.413669
								if( Negative_Money_Flow > 545607 )
									ret := 0.075000
						if( Positive_Money_Flow_Sum > 3.4759e+07 )
							if( rsi1 <= 50.094 )
								if( Money_Flow_Ratio <= 1.02935 )
									ret := -0.006623
								if( Money_Flow_Ratio > 1.02935 )
									ret := -0.741071 // sell
							if( rsi1 > 50.094 )
								if( MFI_High <= -6.22932 )
									ret := 0.351955
								if( MFI_High > -6.22932 )
									ret := -0.714286 // sell
		if( d > 21.4647 )
			if( Positive_Money_Flow <= 225942 )
				if( k <= 33.5596 )
					if( MFI_High <= -57.7478 )
						if( Raw_Money_Flow <= 1.02398e+06 )
							if( d_k <= 7.49317 )
								if( d_k <= 3.90234 )
									ret := -0.123288
								if( d_k > 3.90234 )
									ret := -0.617021
							if( d_k > 7.49317 )
								if( smoothD_d <= 21.556 )
									ret := -0.666667
								if( smoothD_d > 21.556 )
									ret := 0.281690
						if( Raw_Money_Flow > 1.02398e+06 )
							if( k <= 18.9845 )
								if( Money_Flow_Ratio <= 0.237825 )
									ret := 0.092593
								if( Money_Flow_Ratio > 0.237825 )
									ret := -0.368421
							if( k > 18.9845 )
								if( d <= 43.5442 )
									ret := 0.491803
								if( d > 43.5442 )
									ret := -0.282051
					if( MFI_High > -57.7478 )
						if( d_k <= 4.83459 )
							if( MFI <= 37.0508 )
								if( Negative_Money_Flow <= 9.79302e+06 )
									ret := 0.013198
								if( Negative_Money_Flow > 9.79302e+06 )
									ret := 0.666667
							if( MFI > 37.0508 )
								if( Typical_Price <= 0.106528 )
									ret := -0.083650
								if( Typical_Price > 0.106528 )
									ret := -0.275804
						if( d_k > 4.83459 )
							if( Typical_Price <= 0.104464 )
								if( k <= 27.6633 )
									ret := -0.164483
								if( k > 27.6633 )
									ret := -0.020346
							if( Typical_Price > 0.104464 )
								if( Negative_Money_Flow_Sum <= 2.67831e+07 )
									ret := -0.418202
								if( Negative_Money_Flow_Sum > 2.67831e+07 )
									ret := -0.183594
				if( k > 33.5596 )
					if( Raw_Money_Flow <= 599408 )
						if( Negative_Money_Flow_Sum <= 8.71291e+06 )
							if( Money_Flow_Ratio <= 0.619716 )
								if( Negative_Money_Flow_Sum <= 5.96692e+06 )
									ret := 0.106776
								if( Negative_Money_Flow_Sum > 5.96692e+06 )
									ret := -0.356250
							if( Money_Flow_Ratio > 0.619716 )
								if( rsi1 <= 44.9031 )
									ret := -0.366707
								if( rsi1 > 44.9031 )
									ret := 0.031719
						if( Negative_Money_Flow_Sum > 8.71291e+06 )
							if( MFI_High <= -58.5684 )
								if( d <= 36.6067 )
									ret := -0.590909
								if( d > 36.6067 )
									ret := 0.066667
							if( MFI_High > -58.5684 )
								if( k <= 47.8287 )
									ret := 0.537037
								if( k > 47.8287 )
									ret := -0.416667
					if( Raw_Money_Flow > 599408 )
						if( rsi1 <= 55.2205 )
							if( MFI_High <= -19.1733 )
								if( Money_Flow_Ratio <= 0.618441 )
									ret := 0.257022
								if( Money_Flow_Ratio > 0.618441 )
									ret := -0.028405
							if( MFI_High > -19.1733 )
								if( Negative_Money_Flow_Sum <= 4.23697e+07 )
									ret := -0.687919
								if( Negative_Money_Flow_Sum > 4.23697e+07 )
									ret := 0.300000
						if( rsi1 > 55.2205 )
							if( Money_Flow_Ratio <= 2.28368 )
								if( Raw_Money_Flow <= 1.02227e+07 )
									ret := 0.500000
								if( Raw_Money_Flow > 1.02227e+07 )
									ret := -0.375000
							if( Money_Flow_Ratio > 2.28368 )
								if( Negative_Money_Flow_Sum <= 3.21704e+07 )
									ret := -0.041551
								if( Negative_Money_Flow_Sum > 3.21704e+07 )
									ret := 0.470588
			if( Positive_Money_Flow > 225942 )
				if( rsi1 <= 56.8125 )
					if( rsi1 <= 36.5307 )
						if( MFI_Low <= 13.3999 )
							if( k <= 11.335 )
								if( smoothK_k <= 6.03574 )
									ret := 0.083333
								if( smoothK_k > 6.03574 )
									ret := 0.928571 // buy
							if( k > 11.335 )
								if( d <= 47.2317 )
									ret := -0.289419
								if( d > 47.2317 )
									ret := -0.777778 // sell
						if( MFI_Low > 13.3999 )
							if( Typical_Price <= 0.061447 )
								ret := 0.181818
							if( Typical_Price > 0.061447 )
								if( MFI_High <= -29.1427 )
									ret := -0.643902
								if( MFI_High > -29.1427 )
									ret := -0.819188 // sell
					if( rsi1 > 36.5307 )
						if( Positive_Money_Flow_Sum <= 3.33772e+06 )
							if( MFI <= 24.429 )
								if( MFI_High <= -58.3655 )
									ret := 0.776119 // buy
								if( MFI_High > -58.3655 )
									ret := 0.363636
							if( MFI > 24.429 )
								if( MFI <= 53.3528 )
									ret := -0.106752
								if( MFI > 53.3528 )
									ret := -0.411609
						if( Positive_Money_Flow_Sum > 3.33772e+06 )
							if( d_k <= 2.57229 )
								if( Money_Flow_Ratio <= 0.838131 )
									ret := 0.050633
								if( Money_Flow_Ratio > 0.838131 )
									ret := -0.411436
							if( d_k > 2.57229 )
								if( MFI_Low <= 35.355 )
									ret := -0.234731
								if( MFI_Low > 35.355 )
									ret := -0.572044
				if( rsi1 > 56.8125 )
					if( MFI_Low <= 59.3962 )
						if( MFI_Low <= 36.1044 )
							if( Typical_Price <= 0.087732 )
								if( smoothD_d <= 24.0756 )
									ret := 0.459459
								if( smoothD_d > 24.0756 )
									ret := 0.063953
							if( Typical_Price > 0.087732 )
								if( MFI <= 52.3459 )
									ret := 0.364865
								if( MFI > 52.3459 )
									ret := 0.796296 // buy
						if( MFI_Low > 36.1044 )
							if( Raw_Money_Flow <= 479790 )
								if( rsi1 <= 61.8162 )
									ret := 0.049505
								if( rsi1 > 61.8162 )
									ret := 0.292818
							if( Raw_Money_Flow > 479790 )
								if( MFI <= 56.7958 )
									ret := -0.642857
								if( MFI > 56.7958 )
									ret := -0.035517
					if( MFI_Low > 59.3962 )
						if( d <= 63.4827 )
							if( Raw_Money_Flow <= 2.54901e+06 )
								if( d <= 53.6776 )
									ret := -0.241192
								if( d > 53.6776 )
									ret := 0.151515
							if( Raw_Money_Flow > 2.54901e+06 )
								if( MFI_Low <= 71.4429 )
									ret := -0.715789 // sell
								if( MFI_Low > 71.4429 )
									ret := -1.000000 // sell
						if( d > 63.4827 )
							if( smoothK_k <= 44.4529 )
								ret := 0.833333 // buy
							if( smoothK_k > 44.4529 )
								ret := 0.000000
	if( k > 49.8886 )
		if( k <= 78.2597 )
			if( Positive_Money_Flow <= 103486 )
				if( MFI_Low <= 20.1209 )
					if( Negative_Money_Flow <= 860267 )
						if( smoothD_d <= 48.7767 )
							if( Negative_Money_Flow_Sum <= 1.1966e+07 )
								if( rsi1 <= 40.3775 )
									ret := -0.146018
								if( rsi1 > 40.3775 )
									ret := 0.215247
							if( Negative_Money_Flow_Sum > 1.1966e+07 )
								if( Negative_Money_Flow <= 795247 )
									ret := -0.500000
								if( Negative_Money_Flow > 795247 )
									ret := 0.052632
						if( smoothD_d > 48.7767 )
							if( Negative_Money_Flow <= 100754 )
								if( d_k <= 5.94288 )
									ret := 0.092308
								if( d_k > 5.94288 )
									ret := -0.169231
							if( Negative_Money_Flow > 100754 )
								if( d_k <= 6.1444 )
									ret := 0.428571
								if( d_k > 6.1444 )
									ret := 0.206395
					if( Negative_Money_Flow > 860267 )
						if( MFI_Low <= 19.46 )
							if( MFI_Low <= 17.7966 )
								if( rsi1 <= 34.8305 )
									ret := 0.095238
								if( rsi1 > 34.8305 )
									ret := 0.623369
							if( MFI_Low > 17.7966 )
								if( Raw_Money_Flow <= 2.98638e+06 )
									ret := 0.447154
								if( Raw_Money_Flow > 2.98638e+06 )
									ret := -0.260274
						if( MFI_Low > 19.46 )
							if( MFI <= 39.8534 )
								if( d <= 71.7215 )
									ret := 1.000000 // buy
								if( d > 71.7215 )
									ret := 0.818182 // buy
							if( MFI > 39.8534 )
								if( MFI_High <= -39.9864 )
									ret := 0.428571
								if( MFI_High > -39.9864 )
									ret := 0.904762 // buy
				if( MFI_Low > 20.1209 )
					if( d_k <= -0.480083 )
						if( Positive_Money_Flow_Sum <= 6.33929e+06 )
							if( smoothK_k <= 51.2631 )
								if( MFI_Low <= 21.5868 )
									ret := -0.666667
								if( MFI_Low > 21.5868 )
									ret := -0.061538
							if( smoothK_k > 51.2631 )
								if( MFI_Low <= 51.0927 )
									ret := 0.172393
								if( MFI_Low > 51.0927 )
									ret := -0.232877
						if( Positive_Money_Flow_Sum > 6.33929e+06 )
							if( Negative_Money_Flow <= 1.42747e+07 )
								if( d_k <= -25.4054 )
									ret := -0.163265
								if( d_k > -25.4054 )
									ret := 0.374109
							if( Negative_Money_Flow > 1.42747e+07 )
								if( Negative_Money_Flow_Sum <= 6.89695e+07 )
									ret := -0.272727
								if( Negative_Money_Flow_Sum > 6.89695e+07 )
									ret := -1.000000 // sell
					if( d_k > -0.480083 )
						if( smoothD_d <= 67.695 )
							if( Positive_Money_Flow_Sum <= 4.08861e+07 )
								if( d_k <= 12.2476 )
									ret := 0.044355
								if( d_k > 12.2476 )
									ret := 0.320611
							if( Positive_Money_Flow_Sum > 4.08861e+07 )
								if( Typical_Price <= 0.184217 )
									ret := -0.343874
								if( Typical_Price > 0.184217 )
									ret := 0.434783
						if( smoothD_d > 67.695 )
							if( Positive_Money_Flow_Sum <= 2.91329e+07 )
								if( smoothD_d <= 85.235 )
									ret := 0.162268
								if( smoothD_d > 85.235 )
									ret := -0.089109
							if( Positive_Money_Flow_Sum > 2.91329e+07 )
								if( Raw_Money_Flow <= 1.95863e+07 )
									ret := 0.417051
								if( Raw_Money_Flow > 1.95863e+07 )
									ret := -0.375000
			if( Positive_Money_Flow > 103486 )
				if( rsi1 <= 53.9949 )
					if( k <= 65.8344 )
						if( MFI_High <= -24.7508 )
							if( rsi1 <= 37.9976 )
								if( Typical_Price <= 0.085474 )
									ret := -0.157434
								if( Typical_Price > 0.085474 )
									ret := -0.463104
							if( rsi1 > 37.9976 )
								if( smoothD_d <= 55.9279 )
									ret := 0.105161
								if( smoothD_d > 55.9279 )
									ret := -0.155405
						if( MFI_High > -24.7508 )
							if( Positive_Money_Flow <= 1.41945e+06 )
								if( smoothK_k <= 57.9545 )
									ret := -0.478589
								if( smoothK_k > 57.9545 )
									ret := -0.216049
							if( Positive_Money_Flow > 1.41945e+06 )
								if( Negative_Money_Flow_Sum <= 1.52206e+07 )
									ret := -0.708738 // sell
								if( Negative_Money_Flow_Sum > 1.52206e+07 )
									ret := -0.939759 // sell
					if( k > 65.8344 )
						if( Money_Flow_Ratio <= 0.786478 )
							if( MFI_Low <= 16.0129 )
								if( rsi1 <= 39.151 )
									ret := -0.243161
								if( rsi1 > 39.151 )
									ret := 0.153153
							if( MFI_Low > 16.0129 )
								if( rsi1 <= 39.1388 )
									ret := -0.212121
								if( rsi1 > 39.1388 )
									ret := 0.277344
						if( Money_Flow_Ratio > 0.786478 )
							if( Positive_Money_Flow_Sum <= 9.38988e+06 )
								if( Negative_Money_Flow_Sum <= 6.11957e+06 )
									ret := -0.127358
								if( Negative_Money_Flow_Sum > 6.11957e+06 )
									ret := 0.214286
							if( Positive_Money_Flow_Sum > 9.38988e+06 )
								if( rsi1 <= 49.0943 )
									ret := -0.603448
								if( rsi1 > 49.0943 )
									ret := -0.126316
				if( rsi1 > 53.9949 )
					if( MFI_Low <= 41.0829 )
						if( MFI_High <= -34.6156 )
							if( d <= 78.2346 )
								if( MFI_High <= -41.7867 )
									ret := 0.704918 // buy
								if( MFI_High > -41.7867 )
									ret := 0.461224
							if( d > 78.2346 )
								if( d_k <= 10.2275 )
									ret := 0.355932
								if( d_k > 10.2275 )
									ret := -0.234043
						if( MFI_High > -34.6156 )
							if( Typical_Price <= 0.072979 )
								if( rsi1 <= 59.5496 )
									ret := -0.212034
								if( rsi1 > 59.5496 )
									ret := 0.293296
							if( Typical_Price > 0.072979 )
								if( Positive_Money_Flow_Sum <= 2.99213e+07 )
									ret := 0.253959
								if( Positive_Money_Flow_Sum > 2.99213e+07 )
									ret := 0.538905
					if( MFI_Low > 41.0829 )
						if( Positive_Money_Flow_Sum <= 3.63127e+06 )
							if( MFI_High <= 7.32499 )
								if( rsi1 <= 62.6168 )
									ret := -0.044025
								if( rsi1 > 62.6168 )
									ret := 0.228675
							if( MFI_High > 7.32499 )
								ret := -0.421053
						if( Positive_Money_Flow_Sum > 3.63127e+06 )
							if( Typical_Price <= 0.131893 )
								if( d_k <= 8.18429 )
									ret := -0.209792
								if( d_k > 8.18429 )
									ret := 0.234864
							if( Typical_Price > 0.131893 )
								if( MFI_Low <= 46.0103 )
									ret := 0.468421
								if( MFI_Low > 46.0103 )
									ret := -0.009597
		if( k > 78.2597 )
			if( MFI_Low <= 45.0436 )
				if( Raw_Money_Flow <= 358255 )
					if( Typical_Price <= 0.081983 )
						if( Raw_Money_Flow <= 169917 )
							if( Typical_Price <= 0.061984 )
								if( rsi1 <= 41.0805 )
									ret := -0.323529
								if( rsi1 > 41.0805 )
									ret := 0.046400
							if( Typical_Price > 0.061984 )
								if( d_k <= -5.28239 )
									ret := 0.040872
								if( d_k > -5.28239 )
									ret := 0.202263
						if( Raw_Money_Flow > 169917 )
							if( rsi1 <= 67.5687 )
								if( smoothK_k <= 95.7742 )
									ret := 0.214432
								if( smoothK_k > 95.7742 )
									ret := -0.022936
							if( rsi1 > 67.5687 )
								if( Positive_Money_Flow_Sum <= 4.59781e+06 )
									ret := 0.585278
								if( Positive_Money_Flow_Sum > 4.59781e+06 )
									ret := 0.206897
					if( Typical_Price > 0.081983 )
						if( Negative_Money_Flow_Sum <= 1.35217e+07 )
							if( Typical_Price <= 0.103832 )
								if( rsi1 <= 53.1267 )
									ret := 0.212903
								if( rsi1 > 53.1267 )
									ret := 0.606061
							if( Typical_Price > 0.103832 )
								if( rsi1 <= 55.7149 )
									ret := -0.223776
								if( rsi1 > 55.7149 )
									ret := 0.484950
						if( Negative_Money_Flow_Sum > 1.35217e+07 )
							if( d <= 79.5613 )
								ret := -0.916667 // sell
							if( d > 79.5613 )
								ret := 0.117647
				if( Raw_Money_Flow > 358255 )
					if( k <= 90.5977 )
						if( Typical_Price <= 0.093198 )
							if( Negative_Money_Flow_Sum <= 3.21611e+07 )
								if( rsi1 <= 54.9502 )
									ret := 0.204420
								if( rsi1 > 54.9502 )
									ret := 0.433288
							if( Negative_Money_Flow_Sum > 3.21611e+07 )
								if( Money_Flow_Ratio <= 0.513472 )
									ret := 0.300000
								if( Money_Flow_Ratio > 0.513472 )
									ret := -0.415385
						if( Typical_Price > 0.093198 )
							if( Negative_Money_Flow_Sum <= 7.23211e+07 )
								if( rsi1 <= 57.0624 )
									ret := 0.340022
								if( rsi1 > 57.0624 )
									ret := 0.655908
							if( Negative_Money_Flow_Sum > 7.23211e+07 )
								if( rsi1 <= 39.0849 )
									ret := -0.547170
								if( rsi1 > 39.0849 )
									ret := 0.435897
					if( k > 90.5977 )
						if( Negative_Money_Flow <= 760860 )
							if( Positive_Money_Flow_Sum <= 1.01478e+07 )
								if( Raw_Money_Flow <= 3.26955e+06 )
									ret := 0.455240
								if( Raw_Money_Flow > 3.26955e+06 )
									ret := -0.483871
							if( Positive_Money_Flow_Sum > 1.01478e+07 )
								if( Negative_Money_Flow_Sum <= 8.70403e+07 )
									ret := 0.600993
								if( Negative_Money_Flow_Sum > 8.70403e+07 )
									ret := 0.165049
						if( Negative_Money_Flow > 760860 )
							if( smoothK_k <= 91.7767 )
								if( Negative_Money_Flow_Sum <= 3.11837e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 3.11837e+06 )
									ret := 0.729412 // buy
							if( smoothK_k > 91.7767 )
								if( rsi1 <= 42.5174 )
									ret := 0.146067
								if( rsi1 > 42.5174 )
									ret := 0.637135
			if( MFI_Low > 45.0436 )
				if( d_k <= -7.56497 )
					if( rsi1 <= 72.2302 )
						if( Raw_Money_Flow <= 1.20938e+06 )
							if( MFI_Low <= 57.5621 )
								if( Typical_Price <= 0.05914 )
									ret := 0.866667 // buy
								if( Typical_Price > 0.05914 )
									ret := 0.151685
							if( MFI_Low > 57.5621 )
								if( Positive_Money_Flow_Sum <= 5.43229e+06 )
									ret := 0.157895
								if( Positive_Money_Flow_Sum > 5.43229e+06 )
									ret := -0.677419
						if( Raw_Money_Flow > 1.20938e+06 )
							if( smoothD_d <= 64.728 )
								if( Money_Flow_Ratio <= 3.34117 )
									ret := -0.272727
								if( Money_Flow_Ratio > 3.34117 )
									ret := 0.538462
							if( smoothD_d > 64.728 )
								if( d_k <= -14.0006 )
									ret := -0.406780
								if( d_k > -14.0006 )
									ret := -0.787402 // sell
					if( rsi1 > 72.2302 )
						if( Typical_Price <= 0.107116 )
							if( Negative_Money_Flow_Sum <= 2.39341e+06 )
								if( Typical_Price <= 0.071103 )
									ret := 0.162162
								if( Typical_Price > 0.071103 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 2.39341e+06 )
								if( MFI <= 85.85 )
									ret := 0.479798
								if( MFI > 85.85 )
									ret := -0.541667
						if( Typical_Price > 0.107116 )
							if( MFI_Low <= 58.6996 )
								if( Typical_Price <= 0.169765 )
									ret := 0.950000 // buy
								if( Typical_Price > 0.169765 )
									ret := 0.777778 // buy
							if( MFI_Low > 58.6996 )
								if( Negative_Money_Flow_Sum <= 8.4215e+06 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 8.4215e+06 )
									ret := -0.217391
				if( d_k > -7.56497 )
					if( rsi1 <= 66.9586 )
						if( k <= 81.2792 )
							if( Raw_Money_Flow <= 2.59913e+06 )
								if( rsi1 <= 56.9008 )
									ret := -0.411765
								if( rsi1 > 56.9008 )
									ret := 0.004274
							if( Raw_Money_Flow > 2.59913e+06 )
								if( Negative_Money_Flow_Sum <= 2.36896e+07 )
									ret := -0.731707 // sell
								if( Negative_Money_Flow_Sum > 2.36896e+07 )
									ret := 0.300000
						if( k > 81.2792 )
							if( Negative_Money_Flow_Sum <= 1.22193e+07 )
								if( Positive_Money_Flow_Sum <= 2.74543e+07 )
									ret := 0.078947
								if( Positive_Money_Flow_Sum > 2.74543e+07 )
									ret := 0.666667
							if( Negative_Money_Flow_Sum > 1.22193e+07 )
								if( d_k <= 4.31259 )
									ret := -0.311258
								if( d_k > 4.31259 )
									ret := 0.441860
					if( rsi1 > 66.9586 )
						if( Typical_Price <= 0.092817 )
							if( MFI_Low <= 67.3144 )
								if( smoothD_d <= 95.3273 )
									ret := 0.337492
								if( smoothD_d > 95.3273 )
									ret := 0.076389
							if( MFI_Low > 67.3144 )
								if( MFI <= 94.6972 )
									ret := 0.075843
								if( MFI > 94.6972 )
									ret := -0.350877
						if( Typical_Price > 0.092817 )
							if( Typical_Price <= 0.168654 )
								if( k <= 84.7602 )
									ret := 0.326241
								if( k > 84.7602 )
									ret := 0.556071
							if( Typical_Price > 0.168654 )
								if( rsi1 <= 74.4106 )
									ret := 0.742857 // buy
								if( rsi1 > 74.4106 )
									ret := 0.968085 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_DOGEUSDT_15Min_12849de6(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


