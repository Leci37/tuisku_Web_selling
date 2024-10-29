//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: DOTUSDT_15Min_2MT0_87f3b9ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2MT0_87f3b9ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_87f3b9ca(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= -0.040141 )
		if( Typical_Price <= 7.09506 )
			if( Negative_Money_Flow <= 217503 )
				if( MFI <= 36.9646 )
					if( MFI_High <= -58.9397 )
						if( Positive_Money_Flow <= 1.02034e+06 )
							if( Positive_Money_Flow_Sum <= 2.20898e+06 )
								if( ema13 <= -0.059762 )
									ret := 0.174912
								if( ema13 > -0.059762 )
									ret := -0.006303
							if( Positive_Money_Flow_Sum > 2.20898e+06 )
								if( Money_Flow_Ratio <= 0.243973 )
									ret := -0.562500
								if( Money_Flow_Ratio > 0.243973 )
									ret := 0.192308
						if( Positive_Money_Flow > 1.02034e+06 )
							if( tema <= 6.84104 )
								if( Money_Flow_Ratio <= 0.23384 )
									ret := 0.896552 // buy
								if( Money_Flow_Ratio > 0.23384 )
									ret := 0.300000
							if( tema > 6.84104 )
								ret := -0.500000
					if( MFI_High > -58.9397 )
						if( Raw_Money_Flow <= 292409 )
							if( MFI_High <= -51.4416 )
								if( Negative_Money_Flow_Sum <= 2.97538e+06 )
									ret := 0.265116
								if( Negative_Money_Flow_Sum > 2.97538e+06 )
									ret := -0.104530
							if( MFI_High > -51.4416 )
								if( Positive_Money_Flow_Sum <= 870969 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 870969 )
									ret := 0.330000
						if( Raw_Money_Flow > 292409 )
							if( MFI_Low <= 5.00552 )
								if( Positive_Money_Flow <= 534669 )
									ret := 0.623188
								if( Positive_Money_Flow > 534669 )
									ret := 0.284091
							if( MFI_Low > 5.00552 )
								if( Positive_Money_Flow_Sum <= 1.12765e+06 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 1.12765e+06 )
									ret := 0.267287
				if( MFI > 36.9646 )
					if( Positive_Money_Flow <= 474807 )
						if( Raw_Money_Flow <= 370714 )
							if( Raw_Money_Flow <= 339533 )
								if( Negative_Money_Flow <= 41424.8 )
									ret := 0.027559
								if( Negative_Money_Flow > 41424.8 )
									ret := 0.333333
							if( Raw_Money_Flow > 339533 )
								if( MFI <= 40.1339 )
									ret := -0.764706 // sell
								if( MFI > 40.1339 )
									ret := 0.000000
						if( Raw_Money_Flow > 370714 )
							if( Money_Flow_Ratio <= 0.851857 )
								if( Typical_Price <= 6.94971 )
									ret := 0.309524
								if( Typical_Price > 6.94971 )
									ret := -0.714286 // sell
							if( Money_Flow_Ratio > 0.851857 )
								if( Negative_Money_Flow_Sum <= 3.82511e+06 )
									ret := 0.466667
								if( Negative_Money_Flow_Sum > 3.82511e+06 )
									ret := 0.833333 // buy
					if( Positive_Money_Flow > 474807 )
						if( MFI_High <= -25.7356 )
							if( ema2 <= 6.69106 )
								if( MFI <= 39.996 )
									ret := -0.150943
								if( MFI > 39.996 )
									ret := -0.725275 // sell
							if( ema2 > 6.69106 )
								if( Money_Flow_Ratio <= 0.62392 )
									ret := -0.842105 // sell
								if( Money_Flow_Ratio > 0.62392 )
									ret := 0.111111
						if( MFI_High > -25.7356 )
							if( MFI <= 56.5761 )
								if( MFI_Low <= 35.2498 )
									ret := 0.625000
								if( MFI_Low > 35.2498 )
									ret := 1.000000 // buy
							if( MFI > 56.5761 )
								if( Positive_Money_Flow_Sum <= 8.05679e+06 )
									ret := -0.888889 // sell
								if( Positive_Money_Flow_Sum > 8.05679e+06 )
									ret := 0.142857
			if( Negative_Money_Flow > 217503 )
				if( Positive_Money_Flow_Sum <= 1.37182e+07 )
					if( Negative_Money_Flow_Sum <= 2.03097e+06 )
						if( Negative_Money_Flow <= 374405 )
							if( Raw_Money_Flow <= 331206 )
								if( ema13 <= -0.049439 )
									ret := -0.571429
								if( ema13 > -0.049439 )
									ret := 0.086957
							if( Raw_Money_Flow > 331206 )
								if( Positive_Money_Flow_Sum <= 666566 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 666566 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow > 374405 )
							if( Raw_Money_Flow <= 592709 )
								if( Positive_Money_Flow_Sum <= 562431 )
									ret := -0.454545
								if( Positive_Money_Flow_Sum > 562431 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 592709 )
								if( Negative_Money_Flow <= 720097 )
									ret := 0.727273 // buy
								if( Negative_Money_Flow > 720097 )
									ret := -0.833333 // sell
					if( Negative_Money_Flow_Sum > 2.03097e+06 )
						if( Typical_Price <= 6.74292 )
							if( Negative_Money_Flow <= 4.19332e+06 )
								if( MFI <= 17.1117 )
									ret := 0.222222
								if( MFI > 17.1117 )
									ret := 0.359676
							if( Negative_Money_Flow > 4.19332e+06 )
								if( Negative_Money_Flow <= 8.59037e+06 )
									ret := 0.950000 // buy
								if( Negative_Money_Flow > 8.59037e+06 )
									ret := 0.200000
						if( Typical_Price > 6.74292 )
							if( MFI <= 25.6629 )
								if( MFI_High <= -56.2057 )
									ret := 0.150826
								if( MFI_High > -56.2057 )
									ret := -0.223684
							if( MFI > 25.6629 )
								if( MFI_High <= -20.7159 )
									ret := 0.382166
								if( MFI_High > -20.7159 )
									ret := -0.857143 // sell
				if( Positive_Money_Flow_Sum > 1.37182e+07 )
					ret := 1.000000 // buy
		if( Typical_Price > 7.09506 )
			if( Positive_Money_Flow_Sum <= 3.49635e+07 )
				if( Typical_Price <= 10.8505 )
					if( Raw_Money_Flow <= 1.31931e+06 )
						if( MFI_Low <= -9.90183 )
							if( Negative_Money_Flow_Sum <= 1.72363e+07 )
								if( Raw_Money_Flow <= 436000 )
									ret := -0.736842 // sell
								if( Raw_Money_Flow > 436000 )
									ret := -0.088235
							if( Negative_Money_Flow_Sum > 1.72363e+07 )
								ret := -1.000000 // sell
						if( MFI_Low > -9.90183 )
							if( Negative_Money_Flow_Sum <= 3.12926e+06 )
								if( Negative_Money_Flow_Sum <= 1.80658e+06 )
									ret := -0.344828
								if( Negative_Money_Flow_Sum > 1.80658e+06 )
									ret := 0.358696
							if( Negative_Money_Flow_Sum > 3.12926e+06 )
								if( ema13 <= -0.136913 )
									ret := 0.209226
								if( ema13 > -0.136913 )
									ret := 0.057469
					if( Raw_Money_Flow > 1.31931e+06 )
						if( Positive_Money_Flow_Sum <= 8.77201e+06 )
							if( ema12 <= -0.101748 )
								if( ema13 <= -0.374802 )
									ret := -0.200000
								if( ema13 > -0.374802 )
									ret := 0.605536
							if( ema12 > -0.101748 )
								if( Negative_Money_Flow_Sum <= 1.53278e+07 )
									ret := 0.155786
								if( Negative_Money_Flow_Sum > 1.53278e+07 )
									ret := 0.556122
						if( Positive_Money_Flow_Sum > 8.77201e+06 )
							if( Typical_Price <= 8.14262 )
								if( Positive_Money_Flow_Sum <= 1.50688e+07 )
									ret := 0.176471
								if( Positive_Money_Flow_Sum > 1.50688e+07 )
									ret := 0.682540
							if( Typical_Price > 8.14262 )
								if( Typical_Price <= 8.3659 )
									ret := -0.742857 // sell
								if( Typical_Price > 8.3659 )
									ret := 0.012371
				if( Typical_Price > 10.8505 )
					if( Money_Flow_Ratio <= 0.554144 )
						if( ema12 <= -0.086488 )
							if( Positive_Money_Flow_Sum <= 1.39345e+07 )
								if( Negative_Money_Flow_Sum <= 8.46804e+06 )
									ret := -0.416667
								if( Negative_Money_Flow_Sum > 8.46804e+06 )
									ret := 0.262887
							if( Positive_Money_Flow_Sum > 1.39345e+07 )
								if( MFI_Low <= 13.6088 )
									ret := -0.820513 // sell
								if( MFI_Low > 13.6088 )
									ret := 0.727273 // buy
						if( ema12 > -0.086488 )
							if( Negative_Money_Flow_Sum <= 1.22692e+07 )
								if( ema12 <= -0.035293 )
									ret := -0.025126
								if( ema12 > -0.035293 )
									ret := -0.651515
							if( Negative_Money_Flow_Sum > 1.22692e+07 )
								if( Negative_Money_Flow <= 1.98798e+06 )
									ret := -0.700000 // sell
								if( Negative_Money_Flow > 1.98798e+06 )
									ret := 0.133333
					if( Money_Flow_Ratio > 0.554144 )
						if( tema <= 11.9604 )
							if( Negative_Money_Flow_Sum <= 6.51151e+06 )
								if( ema12 <= -0.019444 )
									ret := 0.687500
								if( ema12 > -0.019444 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 6.51151e+06 )
								if( tema <= 11.3741 )
									ret := -0.108108
								if( tema > 11.3741 )
									ret := -0.738095 // sell
						if( tema > 11.9604 )
							if( ema13 <= -0.07553 )
								if( Positive_Money_Flow <= 1.92222e+06 )
									ret := 0.723810 // buy
								if( Positive_Money_Flow > 1.92222e+06 )
									ret := 0.071429
							if( ema13 > -0.07553 )
								if( Positive_Money_Flow_Sum <= 3.23903e+06 )
									ret := 0.521739
								if( Positive_Money_Flow_Sum > 3.23903e+06 )
									ret := -0.194805
			if( Positive_Money_Flow_Sum > 3.49635e+07 )
				if( Money_Flow_Ratio <= 0.737091 )
					ret := -0.500000
				if( Money_Flow_Ratio > 0.737091 )
					if( ema2 <= 10.0014 )
						ret := -0.750000 // sell
					if( ema2 > 10.0014 )
						ret := -1.000000 // sell
	if( ema13 > -0.040141 )
		if( ema1 <= 10.4276 )
			if( Positive_Money_Flow_Sum <= 1.65243e+07 )
				if( Negative_Money_Flow <= 133056 )
					if( Positive_Money_Flow_Sum <= 1.35879e+07 )
						if( MFI <= 77.9914 )
							if( Positive_Money_Flow_Sum <= 3.48516e+06 )
								if( Negative_Money_Flow_Sum <= 1.4466e+06 )
									ret := 0.000728
								if( Negative_Money_Flow_Sum > 1.4466e+06 )
									ret := 0.057754
							if( Positive_Money_Flow_Sum > 3.48516e+06 )
								if( ema1 <= 6.2453 )
									ret := 0.116963
								if( ema1 > 6.2453 )
									ret := -0.060937
						if( MFI > 77.9914 )
							if( Raw_Money_Flow <= 1.70071e+06 )
								if( tema <= 8.21011 )
									ret := 0.075588
								if( tema > 8.21011 )
									ret := -0.182099
							if( Raw_Money_Flow > 1.70071e+06 )
								if( Money_Flow_Ratio <= 4.50955 )
									ret := 0.647727
								if( Money_Flow_Ratio > 4.50955 )
									ret := 0.253589
					if( Positive_Money_Flow_Sum > 1.35879e+07 )
						if( Negative_Money_Flow_Sum <= 9.53862e+06 )
							if( ema13 <= 0.200245 )
								if( ema3 <= 7.23376 )
									ret := -0.083333
								if( ema3 > 7.23376 )
									ret := -0.492823
							if( ema13 > 0.200245 )
								if( MFI <= 88.4881 )
									ret := 1.000000 // buy
								if( MFI > 88.4881 )
									ret := -0.666667
						if( Negative_Money_Flow_Sum > 9.53862e+06 )
							if( Positive_Money_Flow_Sum <= 1.56136e+07 )
								if( MFI <= 50.3607 )
									ret := -0.681818
								if( MFI > 50.3607 )
									ret := 0.020000
							if( Positive_Money_Flow_Sum > 1.56136e+07 )
								if( ema3 <= 8.02707 )
									ret := 0.944444 // buy
								if( ema3 > 8.02707 )
									ret := 0.318182
				if( Negative_Money_Flow > 133056 )
					if( ema2 <= 7.05052 )
						if( Negative_Money_Flow <= 327588 )
							if( Negative_Money_Flow <= 195759 )
								if( MFI <= 9.61431 )
									ret := -0.586207
								if( MFI > 9.61431 )
									ret := 0.101386
							if( Negative_Money_Flow > 195759 )
								if( Raw_Money_Flow <= 324411 )
									ret := 0.024926
								if( Raw_Money_Flow > 324411 )
									ret := -0.234848
						if( Negative_Money_Flow > 327588 )
							if( MFI <= 12.7981 )
								if( Typical_Price <= 4.17004 )
									ret := 0.320000
								if( Typical_Price > 4.17004 )
									ret := -0.356436
							if( MFI > 12.7981 )
								if( Positive_Money_Flow_Sum <= 4.0186e+06 )
									ret := 0.130766
								if( Positive_Money_Flow_Sum > 4.0186e+06 )
									ret := 0.216585
					if( ema2 > 7.05052 )
						if( Positive_Money_Flow_Sum <= 1.04112e+07 )
							if( ema12 <= 0.003295 )
								if( Positive_Money_Flow_Sum <= 3.15601e+06 )
									ret := -0.001321
								if( Positive_Money_Flow_Sum > 3.15601e+06 )
									ret := 0.122255
							if( ema12 > 0.003295 )
								if( Negative_Money_Flow <= 479069 )
									ret := 0.025316
								if( Negative_Money_Flow > 479069 )
									ret := -0.143659
						if( Positive_Money_Flow_Sum > 1.04112e+07 )
							if( MFI <= 38.1505 )
								if( ema3 <= 8.94025 )
									ret := -1.000000 // sell
								if( ema3 > 8.94025 )
									ret := -0.333333
							if( MFI > 38.1505 )
								if( Typical_Price <= 7.84831 )
									ret := 0.386266
								if( Typical_Price > 7.84831 )
									ret := 0.075356
			if( Positive_Money_Flow_Sum > 1.65243e+07 )
				if( Negative_Money_Flow <= 36991.6 )
					if( ema12 <= 0.10628 )
						if( MFI_High <= -8.40451 )
							if( MFI_High <= -23.6296 )
								if( Positive_Money_Flow <= 4.06577e+06 )
									ret := -0.553191
								if( Positive_Money_Flow > 4.06577e+06 )
									ret := 1.000000 // buy
							if( MFI_High > -23.6296 )
								if( MFI_High <= -14.5057 )
									ret := 0.545455
								if( MFI_High > -14.5057 )
									ret := -0.051724
						if( MFI_High > -8.40451 )
							if( MFI <= 82.44 )
								if( ema3 <= 7.14059 )
									ret := -0.350000
								if( ema3 > 7.14059 )
									ret := -0.876923 // sell
							if( MFI > 82.44 )
								if( ema3 <= 6.26869 )
									ret := -0.600000
								if( ema3 > 6.26869 )
									ret := 0.297297
					if( ema12 > 0.10628 )
						if( Positive_Money_Flow <= 5.722e+06 )
							if( Positive_Money_Flow_Sum <= 3.29633e+07 )
								if( ema3 <= 5.85977 )
									ret := -0.444444
								if( ema3 > 5.85977 )
									ret := 0.664894
							if( Positive_Money_Flow_Sum > 3.29633e+07 )
								if( MFI_Low <= 61.7413 )
									ret := -0.413793
								if( MFI_Low > 61.7413 )
									ret := 0.600000
						if( Positive_Money_Flow > 5.722e+06 )
							if( Positive_Money_Flow_Sum <= 2.95269e+07 )
								if( Typical_Price <= 8.84526 )
									ret := -0.750000 // sell
								if( Typical_Price > 8.84526 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 2.95269e+07 )
								if( tema <= 8.80863 )
									ret := -0.500000
								if( tema > 8.80863 )
									ret := -0.950000 // sell
				if( Negative_Money_Flow > 36991.6 )
					if( ema2 <= 8.58423 )
						if( MFI_Low <= 64.8723 )
							if( Negative_Money_Flow_Sum <= 7.82226e+06 )
								if( MFI_High <= -0.306019 )
									ret := 0.162162
								if( MFI_High > -0.306019 )
									ret := 0.772727 // buy
							if( Negative_Money_Flow_Sum > 7.82226e+06 )
								if( ema2 <= 6.31349 )
									ret := 0.166667
								if( ema2 > 6.31349 )
									ret := 0.913043 // buy
						if( MFI_Low > 64.8723 )
							if( Positive_Money_Flow_Sum <= 2.10352e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.10352e+07 )
								if( ema2 <= 7.74293 )
									ret := -0.857143 // sell
								if( ema2 > 7.74293 )
									ret := 0.500000
					if( ema2 > 8.58423 )
						if( Negative_Money_Flow <= 2.06625e+06 )
							if( ema2 <= 8.83857 )
								if( Raw_Money_Flow <= 1.4407e+06 )
									ret := -0.600000
								if( Raw_Money_Flow > 1.4407e+06 )
									ret := 0.300000
							if( ema2 > 8.83857 )
								if( Positive_Money_Flow_Sum <= 3.44984e+07 )
									ret := 0.664596
								if( Positive_Money_Flow_Sum > 3.44984e+07 )
									ret := 0.000000
						if( Negative_Money_Flow > 2.06625e+06 )
							if( ema13 <= 0.254612 )
								if( ema1 <= 10.2354 )
									ret := 0.135593
								if( ema1 > 10.2354 )
									ret := -1.000000 // sell
							if( ema13 > 0.254612 )
								if( Negative_Money_Flow <= 3.17326e+06 )
									ret := -0.954545 // sell
								if( Negative_Money_Flow > 3.17326e+06 )
									ret := 0.400000
		if( ema1 > 10.4276 )
			if( ema13 <= 0.331325 )
				if( MFI <= 72.014 )
					if( Negative_Money_Flow_Sum <= 4.88563e+06 )
						if( MFI_High <= -30.3526 )
							if( Negative_Money_Flow_Sum <= 2.34474e+06 )
								if( ema3 <= 16.1223 )
									ret := 1.000000 // buy
								if( ema3 > 16.1223 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 2.34474e+06 )
								if( Positive_Money_Flow <= 572923 )
									ret := -0.383333
								if( Positive_Money_Flow > 572923 )
									ret := 0.588235
						if( MFI_High > -30.3526 )
							if( MFI_High <= -29.2314 )
								if( ema12 <= -0.007391 )
									ret := 0.111111
								if( ema12 > -0.007391 )
									ret := 0.843750 // buy
							if( MFI_High > -29.2314 )
								if( ema13 <= 0.044701 )
									ret := -0.033898
								if( ema13 > 0.044701 )
									ret := 0.270000
					if( Negative_Money_Flow_Sum > 4.88563e+06 )
						if( ema2 <= 11.2227 )
							if( ema12 <= 0.138344 )
								if( ema12 <= 0.049527 )
									ret := -0.095380
								if( ema12 > 0.049527 )
									ret := -0.467213
							if( ema12 > 0.138344 )
								ret := 1.000000 // buy
						if( ema2 > 11.2227 )
							if( Positive_Money_Flow_Sum <= 1.79318e+07 )
								if( Raw_Money_Flow <= 1.25059e+06 )
									ret := -0.408240
								if( Raw_Money_Flow > 1.25059e+06 )
									ret := -0.010101
							if( Positive_Money_Flow_Sum > 1.79318e+07 )
								if( ema2 <= 11.3355 )
									ret := -0.666667
								if( ema2 > 11.3355 )
									ret := -0.975610 // sell
				if( MFI > 72.014 )
					if( Positive_Money_Flow_Sum <= 7.5099e+06 )
						if( Raw_Money_Flow <= 236846 )
							ret := 0.714286 // buy
						if( Raw_Money_Flow > 236846 )
							if( Raw_Money_Flow <= 1.10599e+06 )
								if( tema <= 16.3475 )
									ret := -0.923077 // sell
								if( tema > 16.3475 )
									ret := -0.333333
							if( Raw_Money_Flow > 1.10599e+06 )
								if( ema13 <= 0.101046 )
									ret := 0.500000
								if( ema13 > 0.101046 )
									ret := -0.800000 // sell
					if( Positive_Money_Flow_Sum > 7.5099e+06 )
						if( Raw_Money_Flow <= 826800 )
							if( ema2 <= 14.8522 )
								if( Positive_Money_Flow_Sum <= 1.33425e+07 )
									ret := 0.233333
								if( Positive_Money_Flow_Sum > 1.33425e+07 )
									ret := 0.923077 // buy
							if( ema2 > 14.8522 )
								if( Positive_Money_Flow_Sum <= 9.18688e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 9.18688e+06 )
									ret := -0.800000 // sell
						if( Raw_Money_Flow > 826800 )
							if( Positive_Money_Flow_Sum <= 8.11844e+06 )
								if( ema2 <= 11.9817 )
									ret := 0.750000 // buy
								if( ema2 > 11.9817 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 8.11844e+06 )
								if( Positive_Money_Flow_Sum <= 2.99535e+07 )
									ret := -0.357143
								if( Positive_Money_Flow_Sum > 2.99535e+07 )
									ret := -0.900000 // sell
			if( ema13 > 0.331325 )
				if( ema13 <= 0.407912 )
					if( MFI_High <= 6.55193 )
						if( Negative_Money_Flow <= 1.42655e+06 )
							if( Typical_Price <= 14.5306 )
								ret := 1.000000 // buy
							if( Typical_Price > 14.5306 )
								ret := 0.750000 // buy
						if( Negative_Money_Flow > 1.42655e+06 )
							ret := 0.000000
					if( MFI_High > 6.55193 )
						ret := 0.250000
				if( ema13 > 0.407912 )
					if( Positive_Money_Flow_Sum <= 3.07871e+07 )
						if( Positive_Money_Flow <= 924015 )
							ret := 0.200000
						if( Positive_Money_Flow > 924015 )
							ret := 0.800000 // buy
					if( Positive_Money_Flow_Sum > 3.07871e+07 )
						if( Positive_Money_Flow_Sum <= 3.62676e+07 )
							if( Typical_Price <= 11.137 )
								ret := -0.750000 // sell
							if( Typical_Price > 11.137 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 3.62676e+07 )
							ret := 0.200000
	
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
float op_operation = decision_tree_0_DOTUSDT_15Min_87f3b9ca(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


