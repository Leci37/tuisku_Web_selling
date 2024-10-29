//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: MSFT_1Min_1M00_572b0a4c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_1M00_572b0a4c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_572b0a4c(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 1.65977e+06 )
		if( Positive_Money_Flow_Sum <= 1.30201e+06 )
			if( Negative_Money_Flow <= 45460.6 )
				if( Typical_Price <= 405.983 )
					if( Negative_Money_Flow_Sum <= 1.11529e+06 )
						if( Positive_Money_Flow_Sum <= 705372 )
							if( MFI <= 34.5988 )
								ret := -0.750000 // sell
							if( MFI > 34.5988 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 705372 )
							if( MFI_High <= -14.1139 )
								if( Raw_Money_Flow <= 291094 )
									ret := -0.133333
								if( Raw_Money_Flow > 291094 )
									ret := -0.800000 // sell
							if( MFI_High > -14.1139 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.11529e+06 )
						if( Negative_Money_Flow_Sum <= 2.69452e+06 )
							if( Money_Flow_Ratio <= 0.66222 )
								if( Positive_Money_Flow_Sum <= 1.15785e+06 )
									ret := 0.451613
								if( Positive_Money_Flow_Sum > 1.15785e+06 )
									ret := -0.636364
							if( Money_Flow_Ratio > 0.66222 )
								if( Negative_Money_Flow_Sum <= 1.4693e+06 )
									ret := 0.066667
								if( Negative_Money_Flow_Sum > 1.4693e+06 )
									ret := -0.789474 // sell
						if( Negative_Money_Flow_Sum > 2.69452e+06 )
							if( Raw_Money_Flow <= 129484 )
								ret := 0.166667
							if( Raw_Money_Flow > 129484 )
								if( Raw_Money_Flow <= 301253 )
									ret := -0.733333 // sell
								if( Raw_Money_Flow > 301253 )
									ret := -0.142857
				if( Typical_Price > 405.983 )
					if( MFI_Low <= 31.1998 )
						if( Negative_Money_Flow_Sum <= 1.26025e+06 )
							if( Positive_Money_Flow <= 138429 )
								if( Typical_Price <= 430.354 )
									ret := 0.049180
								if( Typical_Price > 430.354 )
									ret := -0.588235
							if( Positive_Money_Flow > 138429 )
								if( Positive_Money_Flow <= 449940 )
									ret := -0.560606
								if( Positive_Money_Flow > 449940 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 1.26025e+06 )
							if( Positive_Money_Flow <= 406926 )
								if( Positive_Money_Flow_Sum <= 560565 )
									ret := -0.164384
								if( Positive_Money_Flow_Sum > 560565 )
									ret := 0.120912
							if( Positive_Money_Flow > 406926 )
								if( Typical_Price <= 422.001 )
									ret := -0.377358
								if( Typical_Price > 422.001 )
									ret := 0.022727
					if( MFI_Low > 31.1998 )
						if( Negative_Money_Flow_Sum <= 956666 )
							if( Positive_Money_Flow_Sum <= 1.11128e+06 )
								if( Negative_Money_Flow_Sum <= 290035 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 290035 )
									ret := 0.463636
							if( Positive_Money_Flow_Sum > 1.11128e+06 )
								if( Typical_Price <= 420.971 )
									ret := -0.367347
								if( Typical_Price > 420.971 )
									ret := 0.132075
						if( Negative_Money_Flow_Sum > 956666 )
							if( Positive_Money_Flow <= 338754 )
								if( Typical_Price <= 417.277 )
									ret := 0.852941 // buy
								if( Typical_Price > 417.277 )
									ret := 0.391304
							if( Positive_Money_Flow > 338754 )
								ret := -0.142857
			if( Negative_Money_Flow > 45460.6 )
				if( Negative_Money_Flow_Sum <= 3.81432e+06 )
					if( Raw_Money_Flow <= 114940 )
						if( Typical_Price <= 432.81 )
							if( MFI_Low <= 10.7135 )
								if( Typical_Price <= 430.854 )
									ret := 0.097561
								if( Typical_Price > 430.854 )
									ret := 0.777778 // buy
							if( MFI_Low > 10.7135 )
								if( Positive_Money_Flow_Sum <= 1.27647e+06 )
									ret := 0.562212
								if( Positive_Money_Flow_Sum > 1.27647e+06 )
									ret := -0.125000
						if( Typical_Price > 432.81 )
							if( Negative_Money_Flow_Sum <= 685263 )
								if( Negative_Money_Flow_Sum <= 594501 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 594501 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 685263 )
								if( MFI <= 27.8444 )
									ret := 0.434783
								if( MFI > 27.8444 )
									ret := -0.203125
					if( Raw_Money_Flow > 114940 )
						if( MFI_Low <= 0.112448 )
							if( Typical_Price <= 434.238 )
								if( MFI_High <= -69.383 )
									ret := 0.357143
								if( MFI_High > -69.383 )
									ret := -0.432000
							if( Typical_Price > 434.238 )
								if( Negative_Money_Flow <= 180279 )
									ret := 0.785714 // buy
								if( Negative_Money_Flow > 180279 )
									ret := 0.064516
						if( MFI_Low > 0.112448 )
							if( MFI <= 22.9055 )
								if( Raw_Money_Flow <= 276749 )
									ret := 0.000000
								if( Raw_Money_Flow > 276749 )
									ret := 0.515625
							if( MFI > 22.9055 )
								if( Negative_Money_Flow_Sum <= 2.96327e+06 )
									ret := 0.042827
								if( Negative_Money_Flow_Sum > 2.96327e+06 )
									ret := -0.195652
				if( Negative_Money_Flow_Sum > 3.81432e+06 )
					if( Negative_Money_Flow_Sum <= 2.77979e+07 )
						if( Positive_Money_Flow_Sum <= 601445 )
							if( Negative_Money_Flow_Sum <= 1.03949e+07 )
								if( Typical_Price <= 449.973 )
									ret := 0.842697 // buy
								if( Typical_Price > 449.973 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 1.03949e+07 )
								if( MFI <= 2.94891 )
									ret := 0.750000 // buy
								if( MFI > 2.94891 )
									ret := -0.400000
						if( Positive_Money_Flow_Sum > 601445 )
							if( Negative_Money_Flow <= 749466 )
								if( Negative_Money_Flow <= 422245 )
									ret := 0.220930
								if( Negative_Money_Flow > 422245 )
									ret := 0.615942
							if( Negative_Money_Flow > 749466 )
								if( MFI_Low <= -0.463248 )
									ret := 0.160839
								if( MFI_Low > -0.463248 )
									ret := -0.789474 // sell
					if( Negative_Money_Flow_Sum > 2.77979e+07 )
						if( Typical_Price <= 421.063 )
							if( Typical_Price <= 420.736 )
								if( Negative_Money_Flow_Sum <= 5.10967e+07 )
									ret := -0.571429
								if( Negative_Money_Flow_Sum > 5.10967e+07 )
									ret := 0.113636
							if( Typical_Price > 420.736 )
								ret := 1.000000 // buy
						if( Typical_Price > 421.063 )
							if( Raw_Money_Flow <= 265322 )
								if( Raw_Money_Flow <= 209805 )
									ret := 0.043478
								if( Raw_Money_Flow > 209805 )
									ret := -0.250000
							if( Raw_Money_Flow > 265322 )
								if( Positive_Money_Flow_Sum <= 669998 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 669998 )
									ret := -0.714286 // sell
		if( Positive_Money_Flow_Sum > 1.30201e+06 )
			if( Typical_Price <= 406.311 )
				if( Negative_Money_Flow <= 55266.3 )
					if( Negative_Money_Flow_Sum <= 1.27814e+06 )
						if( Raw_Money_Flow <= 153923 )
							ret := 0.000000
						if( Raw_Money_Flow > 153923 )
							if( Positive_Money_Flow_Sum <= 1.45573e+06 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 1.45573e+06 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.27814e+06 )
						if( Positive_Money_Flow_Sum <= 1.57434e+06 )
							if( Negative_Money_Flow_Sum <= 3.44217e+06 )
								if( MFI_Low <= 28.5065 )
									ret := 0.716667 // buy
								if( MFI_Low > 28.5065 )
									ret := 0.041667
							if( Negative_Money_Flow_Sum > 3.44217e+06 )
								if( Money_Flow_Ratio <= 0.237254 )
									ret := 0.533333
								if( Money_Flow_Ratio > 0.237254 )
									ret := -0.666667
						if( Positive_Money_Flow_Sum > 1.57434e+06 )
							if( Raw_Money_Flow <= 119606 )
								if( MFI <= 44.6624 )
									ret := -0.750000 // sell
								if( MFI > 44.6624 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 119606 )
								if( Typical_Price <= 403.158 )
									ret := 0.250000
								if( Typical_Price > 403.158 )
									ret := -0.500000
				if( Negative_Money_Flow > 55266.3 )
					if( Positive_Money_Flow_Sum <= 1.54073e+06 )
						if( Negative_Money_Flow_Sum <= 2.35038e+06 )
							if( Negative_Money_Flow <= 281259 )
								if( MFI_Low <= 25.304 )
									ret := 1.000000 // buy
								if( MFI_Low > 25.304 )
									ret := 0.411765
							if( Negative_Money_Flow > 281259 )
								if( Positive_Money_Flow_Sum <= 1.42398e+06 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 1.42398e+06 )
									ret := 0.571429
						if( Negative_Money_Flow_Sum > 2.35038e+06 )
							if( MFI <= 25.4695 )
								if( Negative_Money_Flow <= 572744 )
									ret := 0.315789
								if( Negative_Money_Flow > 572744 )
									ret := 0.800000 // buy
							if( MFI > 25.4695 )
								if( MFI_High <= -51.1975 )
									ret := -0.857143 // sell
								if( MFI_High > -51.1975 )
									ret := 0.240000
					if( Positive_Money_Flow_Sum > 1.54073e+06 )
						if( MFI_Low <= 0.664533 )
							ret := 0.400000
						if( MFI_Low > 0.664533 )
							if( Negative_Money_Flow_Sum <= 2.15608e+06 )
								if( Positive_Money_Flow_Sum <= 1.56885e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.56885e+06 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 2.15608e+06 )
								if( Negative_Money_Flow_Sum <= 3.27951e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 3.27951e+06 )
									ret := 0.916667 // buy
			if( Typical_Price > 406.311 )
				if( Positive_Money_Flow_Sum <= 1.40194e+06 )
					if( Positive_Money_Flow <= 211172 )
						if( Negative_Money_Flow <= 327128 )
							if( Negative_Money_Flow <= 239882 )
								if( Raw_Money_Flow <= 118488 )
									ret := 0.200000
								if( Raw_Money_Flow > 118488 )
									ret := 0.473451
							if( Negative_Money_Flow > 239882 )
								if( MFI_Low <= 0.350269 )
									ret := 0.000000
								if( MFI_Low > 0.350269 )
									ret := 0.781818 // buy
						if( Negative_Money_Flow > 327128 )
							if( Typical_Price <= 427.161 )
								if( Negative_Money_Flow <= 1.52485e+06 )
									ret := -0.054795
								if( Negative_Money_Flow > 1.52485e+06 )
									ret := 0.636364
							if( Typical_Price > 427.161 )
								if( Typical_Price <= 446.131 )
									ret := 0.680000
								if( Typical_Price > 446.131 )
									ret := 0.181818
					if( Positive_Money_Flow > 211172 )
						if( Raw_Money_Flow <= 280736 )
							if( Positive_Money_Flow <= 239224 )
								if( Raw_Money_Flow <= 217434 )
									ret := -0.200000
								if( Raw_Money_Flow > 217434 )
									ret := 0.266667
							if( Positive_Money_Flow > 239224 )
								if( MFI_Low <= 15.6569 )
									ret := 0.500000
								if( MFI_Low > 15.6569 )
									ret := -0.866667 // sell
						if( Raw_Money_Flow > 280736 )
							if( Money_Flow_Ratio <= 0.263338 )
								if( Raw_Money_Flow <= 482316 )
									ret := 0.000000
								if( Raw_Money_Flow > 482316 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.263338 )
								if( Positive_Money_Flow <= 480792 )
									ret := 0.457143
								if( Positive_Money_Flow > 480792 )
									ret := 0.000000
				if( Positive_Money_Flow_Sum > 1.40194e+06 )
					if( Typical_Price <= 421.656 )
						if( Negative_Money_Flow_Sum <= 1.84247e+06 )
							if( Typical_Price <= 410.932 )
								if( Positive_Money_Flow_Sum <= 1.4624e+06 )
									ret := -0.484848
								if( Positive_Money_Flow_Sum > 1.4624e+06 )
									ret := -0.063830
							if( Typical_Price > 410.932 )
								if( Negative_Money_Flow_Sum <= 690812 )
									ret := 0.705882 // buy
								if( Negative_Money_Flow_Sum > 690812 )
									ret := 0.136986
						if( Negative_Money_Flow_Sum > 1.84247e+06 )
							if( Positive_Money_Flow_Sum <= 1.48837e+06 )
								if( Raw_Money_Flow <= 70521.6 )
									ret := -0.777778 // sell
								if( Raw_Money_Flow > 70521.6 )
									ret := 0.148649
							if( Positive_Money_Flow_Sum > 1.48837e+06 )
								if( Positive_Money_Flow_Sum <= 1.62218e+06 )
									ret := 0.366782
								if( Positive_Money_Flow_Sum > 1.62218e+06 )
									ret := 0.690141
					if( Typical_Price > 421.656 )
						if( Raw_Money_Flow <= 550306 )
							if( Raw_Money_Flow <= 431027 )
								if( Negative_Money_Flow <= 330493 )
									ret := 0.109170
								if( Negative_Money_Flow > 330493 )
									ret := -0.323529
							if( Raw_Money_Flow > 431027 )
								if( Negative_Money_Flow_Sum <= 2.00378e+07 )
									ret := 0.541176
								if( Negative_Money_Flow_Sum > 2.00378e+07 )
									ret := -0.400000
						if( Raw_Money_Flow > 550306 )
							if( Typical_Price <= 428.839 )
								if( MFI_High <= -48.2476 )
									ret := -0.528302
								if( MFI_High > -48.2476 )
									ret := 0.000000
							if( Typical_Price > 428.839 )
								if( Raw_Money_Flow <= 1.96079e+06 )
									ret := 0.017241
								if( Raw_Money_Flow > 1.96079e+06 )
									ret := 0.714286 // buy
	if( Positive_Money_Flow_Sum > 1.65977e+06 )
		if( Raw_Money_Flow <= 1.08305e+07 )
			if( Negative_Money_Flow <= 23.4561 )
				if( Money_Flow_Ratio <= 4.48041 )
					if( Positive_Money_Flow_Sum <= 4.11949e+07 )
						if( Typical_Price <= 408.043 )
							if( MFI <= 65.853 )
								if( Positive_Money_Flow_Sum <= 2.64772e+07 )
									ret := 0.055589
								if( Positive_Money_Flow_Sum > 2.64772e+07 )
									ret := -0.124601
							if( MFI > 65.853 )
								if( Negative_Money_Flow_Sum <= 1.00382e+06 )
									ret := -0.202703
								if( Negative_Money_Flow_Sum > 1.00382e+06 )
									ret := 0.302872
						if( Typical_Price > 408.043 )
							if( Money_Flow_Ratio <= 0.948958 )
								if( Typical_Price <= 408.609 )
									ret := -0.394737
								if( Typical_Price > 408.609 )
									ret := -0.010687
							if( Money_Flow_Ratio > 0.948958 )
								if( Negative_Money_Flow_Sum <= 664893 )
									ret := 0.314815
								if( Negative_Money_Flow_Sum > 664893 )
									ret := -0.084094
					if( Positive_Money_Flow_Sum > 4.11949e+07 )
						if( Negative_Money_Flow_Sum <= 2.09129e+08 )
							if( MFI <= 42.5353 )
								if( Positive_Money_Flow_Sum <= 6.5761e+07 )
									ret := 0.100000
								if( Positive_Money_Flow_Sum > 6.5761e+07 )
									ret := 0.326371
							if( MFI > 42.5353 )
								if( Negative_Money_Flow_Sum <= 1.12623e+08 )
									ret := 0.046576
								if( Negative_Money_Flow_Sum > 1.12623e+08 )
									ret := -0.350000
						if( Negative_Money_Flow_Sum > 2.09129e+08 )
							if( Raw_Money_Flow <= 9.79698e+06 )
								if( Negative_Money_Flow_Sum <= 1.49514e+09 )
									ret := -0.079439
								if( Negative_Money_Flow_Sum > 1.49514e+09 )
									ret := -0.277778
							if( Raw_Money_Flow > 9.79698e+06 )
								if( MFI_Low <= 0.903379 )
									ret := -0.142857
								if( MFI_Low > 0.903379 )
									ret := -0.761905 // sell
				if( Money_Flow_Ratio > 4.48041 )
					if( Positive_Money_Flow_Sum <= 2.14097e+07 )
						if( Negative_Money_Flow_Sum <= 568522 )
							if( MFI_Low <= 64.3887 )
								if( Negative_Money_Flow_Sum <= 504714 )
									ret := 0.564103
								if( Negative_Money_Flow_Sum > 504714 )
									ret := -0.166667
							if( MFI_Low > 64.3887 )
								if( Positive_Money_Flow_Sum <= 5.87598e+06 )
									ret := -0.099099
								if( Positive_Money_Flow_Sum > 5.87598e+06 )
									ret := -0.545455
						if( Negative_Money_Flow_Sum > 568522 )
							if( Positive_Money_Flow_Sum <= 1.56137e+07 )
								if( Raw_Money_Flow <= 387424 )
									ret := -0.455598
								if( Raw_Money_Flow > 387424 )
									ret := -0.217158
							if( Positive_Money_Flow_Sum > 1.56137e+07 )
								if( Positive_Money_Flow <= 992051 )
									ret := -0.345455
								if( Positive_Money_Flow > 992051 )
									ret := -0.882353 // sell
					if( Positive_Money_Flow_Sum > 2.14097e+07 )
						if( Typical_Price <= 401.833 )
							if( Negative_Money_Flow_Sum <= 1.3797e+07 )
								if( MFI_High <= 6.885 )
									ret := -1.000000 // sell
								if( MFI_High > 6.885 )
									ret := -0.281250
							if( Negative_Money_Flow_Sum > 1.3797e+07 )
								if( Raw_Money_Flow <= 3.33451e+06 )
									ret := -0.400000
								if( Raw_Money_Flow > 3.33451e+06 )
									ret := 0.062500
						if( Typical_Price > 401.833 )
							if( Negative_Money_Flow_Sum <= 1.91623e+08 )
								if( Negative_Money_Flow_Sum <= 433114 )
									ret := 0.636364
								if( Negative_Money_Flow_Sum > 433114 )
									ret := -0.004713
							if( Negative_Money_Flow_Sum > 1.91623e+08 )
								if( Positive_Money_Flow <= 1.86831e+06 )
									ret := -0.055556
								if( Positive_Money_Flow > 1.86831e+06 )
									ret := -0.638889
			if( Negative_Money_Flow > 23.4561 )
				if( Raw_Money_Flow <= 1.164e+06 )
					if( Positive_Money_Flow_Sum <= 4.42822e+06 )
						if( Negative_Money_Flow <= 927738 )
							if( Negative_Money_Flow_Sum <= 585360 )
								if( Positive_Money_Flow_Sum <= 3.42667e+06 )
									ret := 0.705263 // buy
								if( Positive_Money_Flow_Sum > 3.42667e+06 )
									ret := -0.058824
							if( Negative_Money_Flow_Sum > 585360 )
								if( Positive_Money_Flow_Sum <= 4.28137e+06 )
									ret := 0.123457
								if( Positive_Money_Flow_Sum > 4.28137e+06 )
									ret := 0.419753
						if( Negative_Money_Flow > 927738 )
							if( Negative_Money_Flow_Sum <= 4.39436e+06 )
								if( Typical_Price <= 430.315 )
									ret := 0.339623
								if( Typical_Price > 430.315 )
									ret := -0.347826
							if( Negative_Money_Flow_Sum > 4.39436e+06 )
								if( Positive_Money_Flow_Sum <= 1.694e+06 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow_Sum > 1.694e+06 )
									ret := 0.538889
					if( Positive_Money_Flow_Sum > 4.42822e+06 )
						if( MFI_Low <= 36.913 )
							if( MFI <= 43.1412 )
								if( Money_Flow_Ratio <= 0.50993 )
									ret := 0.121807
								if( Money_Flow_Ratio > 0.50993 )
									ret := -0.156566
							if( MFI > 43.1412 )
								if( Typical_Price <= 442.662 )
									ret := 0.295620
								if( Typical_Price > 442.662 )
									ret := -0.150000
						if( MFI_Low > 36.913 )
							if( Typical_Price <= 425.826 )
								if( Negative_Money_Flow_Sum <= 8.12296e+06 )
									ret := 0.102715
								if( Negative_Money_Flow_Sum > 8.12296e+06 )
									ret := -0.228216
							if( Typical_Price > 425.826 )
								if( Positive_Money_Flow_Sum <= 8.89091e+06 )
									ret := -0.268018
								if( Positive_Money_Flow_Sum > 8.89091e+06 )
									ret := 0.060606
				if( Raw_Money_Flow > 1.164e+06 )
					if( Typical_Price <= 415.679 )
						if( Typical_Price <= 384.041 )
							ret := 1.000000 // buy
						if( Typical_Price > 384.041 )
							if( MFI <= 73.9934 )
								if( Money_Flow_Ratio <= 1.34011 )
									ret := 0.070091
								if( Money_Flow_Ratio > 1.34011 )
									ret := -0.048048
							if( MFI > 73.9934 )
								if( Positive_Money_Flow_Sum <= 1.6256e+08 )
									ret := 0.092715
								if( Positive_Money_Flow_Sum > 1.6256e+08 )
									ret := 0.337838
					if( Typical_Price > 415.679 )
						if( MFI <= 14.7767 )
							if( Raw_Money_Flow <= 2.7213e+06 )
								if( Typical_Price <= 427.119 )
									ret := 0.700000 // buy
								if( Typical_Price > 427.119 )
									ret := 0.263158
							if( Raw_Money_Flow > 2.7213e+06 )
								if( Negative_Money_Flow_Sum <= 2.72485e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.72485e+07 )
									ret := 0.004310
						if( MFI > 14.7767 )
							if( Typical_Price <= 453.574 )
								if( MFI_Low <= 10.7847 )
									ret := -0.070019
								if( MFI_Low > 10.7847 )
									ret := 0.009209
							if( Typical_Price > 453.574 )
								if( Positive_Money_Flow_Sum <= 7.41668e+06 )
									ret := 0.191489
								if( Positive_Money_Flow_Sum > 7.41668e+06 )
									ret := -0.128739
		if( Raw_Money_Flow > 1.08305e+07 )
			if( MFI_Low <= 5.59719 )
				if( Typical_Price <= 391.94 )
					if( Negative_Money_Flow <= 1.06203e+08 )
						if( Money_Flow_Ratio <= 0.278179 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.278179 )
							ret := 0.500000
					if( Negative_Money_Flow > 1.06203e+08 )
						ret := 0.000000
				if( Typical_Price > 391.94 )
					if( Negative_Money_Flow_Sum <= 1.5199e+08 )
						if( Typical_Price <= 404.638 )
							if( Money_Flow_Ratio <= 0.18402 )
								if( Raw_Money_Flow <= 2.65651e+07 )
									ret := 0.600000
								if( Raw_Money_Flow > 2.65651e+07 )
									ret := -0.250000
							if( Money_Flow_Ratio > 0.18402 )
								if( Raw_Money_Flow <= 1.30017e+07 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 1.30017e+07 )
									ret := -0.254902
						if( Typical_Price > 404.638 )
							if( Negative_Money_Flow <= 2.63477e+07 )
								if( Positive_Money_Flow_Sum <= 3.489e+07 )
									ret := 0.041528
								if( Positive_Money_Flow_Sum > 3.489e+07 )
									ret := 0.372093
							if( Negative_Money_Flow > 2.63477e+07 )
								if( Raw_Money_Flow <= 1.38939e+08 )
									ret := 0.516484
								if( Raw_Money_Flow > 1.38939e+08 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 1.5199e+08 )
						if( Positive_Money_Flow_Sum <= 5.43283e+08 )
							if( Positive_Money_Flow <= 3.11855e+07 )
								if( Negative_Money_Flow_Sum <= 5.02735e+08 )
									ret := -0.020670
								if( Negative_Money_Flow_Sum > 5.02735e+08 )
									ret := -0.170178
							if( Positive_Money_Flow > 3.11855e+07 )
								if( Positive_Money_Flow_Sum <= 1.62475e+08 )
									ret := 0.336842
								if( Positive_Money_Flow_Sum > 1.62475e+08 )
									ret := -0.127907
						if( Positive_Money_Flow_Sum > 5.43283e+08 )
							if( Raw_Money_Flow <= 2.76932e+08 )
								if( Positive_Money_Flow_Sum <= 7.93242e+08 )
									ret := -0.937500 // sell
								if( Positive_Money_Flow_Sum > 7.93242e+08 )
									ret := -0.250000
							if( Raw_Money_Flow > 2.76932e+08 )
								ret := 0.833333 // buy
			if( MFI_Low > 5.59719 )
				if( Money_Flow_Ratio <= 1.11145 )
					if( Negative_Money_Flow_Sum <= 1.04435e+08 )
						if( Typical_Price <= 404.572 )
							if( Negative_Money_Flow_Sum <= 7.5328e+07 )
								if( Raw_Money_Flow <= 1.70758e+07 )
									ret := 0.403226
								if( Raw_Money_Flow > 1.70758e+07 )
									ret := -0.625000
							if( Negative_Money_Flow_Sum > 7.5328e+07 )
								if( Typical_Price <= 397.066 )
									ret := 0.291667
								if( Typical_Price > 397.066 )
									ret := -0.385965
						if( Typical_Price > 404.572 )
							if( MFI <= 29.7819 )
								if( Negative_Money_Flow_Sum <= 9.63683e+07 )
									ret := 0.448819
								if( Negative_Money_Flow_Sum > 9.63683e+07 )
									ret := -0.086957
							if( MFI > 29.7819 )
								if( Raw_Money_Flow <= 1.94233e+07 )
									ret := 0.041467
								if( Raw_Money_Flow > 1.94233e+07 )
									ret := 0.199262
					if( Negative_Money_Flow_Sum > 1.04435e+08 )
						if( Positive_Money_Flow_Sum <= 1.79653e+08 )
							if( MFI_High <= -32.3376 )
								if( Typical_Price <= 415.708 )
									ret := 0.189588
								if( Typical_Price > 415.708 )
									ret := 0.083843
							if( MFI_High > -32.3376 )
								if( Raw_Money_Flow <= 2.73423e+07 )
									ret := 0.249169
								if( Raw_Money_Flow > 2.73423e+07 )
									ret := 0.493506
						if( Positive_Money_Flow_Sum > 1.79653e+08 )
							if( Raw_Money_Flow <= 2.63168e+07 )
								if( Typical_Price <= 461.604 )
									ret := -0.200000
								if( Typical_Price > 461.604 )
									ret := 0.846154 // buy
							if( Raw_Money_Flow > 2.63168e+07 )
								if( Raw_Money_Flow <= 6.69693e+07 )
									ret := 0.073892
								if( Raw_Money_Flow > 6.69693e+07 )
									ret := 0.278388
				if( Money_Flow_Ratio > 1.11145 )
					if( Raw_Money_Flow <= 3.45712e+07 )
						if( Positive_Money_Flow_Sum <= 1.6403e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 1.6403e+07 )
							if( Money_Flow_Ratio <= 11.0362 )
								if( Positive_Money_Flow_Sum <= 1.99719e+08 )
									ret := 0.055747
								if( Positive_Money_Flow_Sum > 1.99719e+08 )
									ret := -0.034225
							if( Money_Flow_Ratio > 11.0362 )
								if( Typical_Price <= 423.951 )
									ret := 0.420382
								if( Typical_Price > 423.951 )
									ret := 0.073770
					if( Raw_Money_Flow > 3.45712e+07 )
						if( Negative_Money_Flow_Sum <= 3.91123e+08 )
							if( Positive_Money_Flow_Sum <= 3.72135e+08 )
								if( Money_Flow_Ratio <= 72.443 )
									ret := 0.223464
								if( Money_Flow_Ratio > 72.443 )
									ret := -0.636364
							if( Positive_Money_Flow_Sum > 3.72135e+08 )
								if( Money_Flow_Ratio <= 8.08991 )
									ret := -0.178499
								if( Money_Flow_Ratio > 8.08991 )
									ret := 0.083333
						if( Negative_Money_Flow_Sum > 3.91123e+08 )
							if( Negative_Money_Flow <= 1.69163e+08 )
								if( Negative_Money_Flow_Sum <= 1.33476e+09 )
									ret := 0.736486 // buy
								if( Negative_Money_Flow_Sum > 1.33476e+09 )
									ret := -0.333333
							if( Negative_Money_Flow > 1.69163e+08 )
								if( Typical_Price <= 399.052 )
									ret := -0.875000 // sell
								if( Typical_Price > 399.052 )
									ret := 0.307692
	
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
float op_operation = decision_tree_0_MSFT_1Min_572b0a4c(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


