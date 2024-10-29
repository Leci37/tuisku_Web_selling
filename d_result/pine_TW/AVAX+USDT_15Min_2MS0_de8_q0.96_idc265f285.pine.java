//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AVAXUSDT_15Min_2MS0_c265f285 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AVAXUSDT_15Min_2MS0_c265f285", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AVAXUSDT_15Min_c265f285(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 53.1509 )
		if( rsi1 <= 45.2365 )
			if( MFI_Low <= 26.6321 )
				if( rsi1 <= 30.7015 )
					if( MFI_High <= -52.8902 )
						if( MFI <= 18.0721 )
							if( d_k <= -9.69714 )
								if( k <= 34.3204 )
									ret := -0.674699
								if( k > 34.3204 )
									ret := -0.279070
							if( d_k > -9.69714 )
								if( Negative_Money_Flow_Sum <= 5.4331e+06 )
									ret := -0.281081
								if( Negative_Money_Flow_Sum > 5.4331e+06 )
									ret := 0.019395
						if( MFI > 18.0721 )
							if( smoothD_d <= 23.4912 )
								if( rsi1 <= 18.9471 )
									ret := -0.645455
								if( rsi1 > 18.9471 )
									ret := -0.333888
							if( smoothD_d > 23.4912 )
								if( Raw_Money_Flow <= 448220 )
									ret := -0.349823
								if( Raw_Money_Flow > 448220 )
									ret := 0.039261
					if( MFI_High > -52.8902 )
						if( Positive_Money_Flow <= 9.2235e+06 )
							if( rsi1 <= 26.5269 )
								if( Positive_Money_Flow_Sum <= 377961 )
									ret := -0.233645
								if( Positive_Money_Flow_Sum > 377961 )
									ret := -0.675926
							if( rsi1 > 26.5269 )
								if( Typical_Price <= 32.6315 )
									ret := -0.401376
								if( Typical_Price > 32.6315 )
									ret := -0.754443 // sell
						if( Positive_Money_Flow > 9.2235e+06 )
							ret := 1.000000 // buy
				if( rsi1 > 30.7015 )
					if( Money_Flow_Ratio <= 0.377564 )
						if( d <= 30.3443 )
							if( Positive_Money_Flow <= 18937.2 )
								if( Positive_Money_Flow_Sum <= 900353 )
									ret := -0.045283
								if( Positive_Money_Flow_Sum > 900353 )
									ret := 0.166667
							if( Positive_Money_Flow > 18937.2 )
								if( Typical_Price <= 42.5911 )
									ret := -0.209115
								if( Typical_Price > 42.5911 )
									ret := 0.553571
						if( d > 30.3443 )
							if( MFI_High <= -56.6392 )
								if( d_k <= 7.09816 )
									ret := 0.493274
								if( d_k > 7.09816 )
									ret := 0.082803
							if( MFI_High > -56.6392 )
								if( d_k <= -8.42914 )
									ret := -0.234375
								if( d_k > -8.42914 )
									ret := 0.117318
					if( Money_Flow_Ratio > 0.377564 )
						if( rsi1 <= 39.3609 )
							if( Typical_Price <= 24.6251 )
								if( Negative_Money_Flow <= 256410 )
									ret := -0.287152
								if( Negative_Money_Flow > 256410 )
									ret := -0.093603
							if( Typical_Price > 24.6251 )
								if( Raw_Money_Flow <= 2.75528e+06 )
									ret := -0.433577
								if( Raw_Money_Flow > 2.75528e+06 )
									ret := -0.124105
						if( rsi1 > 39.3609 )
							if( Negative_Money_Flow_Sum <= 4.50071e+07 )
								if( Typical_Price <= 23.3276 )
									ret := -0.058196
								if( Typical_Price > 23.3276 )
									ret := -0.195071
							if( Negative_Money_Flow_Sum > 4.50071e+07 )
								if( Negative_Money_Flow_Sum <= 4.95914e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 4.95914e+07 )
									ret := 0.194805
			if( MFI_Low > 26.6321 )
				if( Raw_Money_Flow <= 123580 )
					if( Negative_Money_Flow_Sum <= 417324 )
						if( d_k <= 10.7244 )
							if( d_k <= 9.9692 )
								if( d <= 11.232 )
									ret := -0.141361
								if( d > 11.232 )
									ret := -0.346821
							if( d_k > 9.9692 )
								ret := -0.916667 // sell
						if( d_k > 10.7244 )
							if( Money_Flow_Ratio <= 3.34697 )
								ret := 0.000000
							if( Money_Flow_Ratio > 3.34697 )
								ret := -0.200000
					if( Negative_Money_Flow_Sum > 417324 )
						if( d <= 44.2679 )
							if( Typical_Price <= 18.03 )
								if( MFI_Low <= 27.9142 )
									ret := -0.652632
								if( MFI_Low > 27.9142 )
									ret := -0.369668
							if( Typical_Price > 18.03 )
								if( Typical_Price <= 22.9783 )
									ret := -0.683168
								if( Typical_Price > 22.9783 )
									ret := -0.475248
						if( d > 44.2679 )
							if( Positive_Money_Flow <= 103414 )
								if( rsi1 <= 35.0428 )
									ret := -0.444444
								if( rsi1 > 35.0428 )
									ret := -0.033058
							if( Positive_Money_Flow > 103414 )
								ret := -0.631579
				if( Raw_Money_Flow > 123580 )
					if( MFI_High <= -20.3129 )
						if( Positive_Money_Flow <= 267355 )
							if( d_k <= 14.5776 )
								if( Typical_Price <= 21.1136 )
									ret := -0.335279
								if( Typical_Price > 21.1136 )
									ret := -0.607819
							if( d_k > 14.5776 )
								if( MFI_Low <= 33.6651 )
									ret := -0.047022
								if( MFI_Low > 33.6651 )
									ret := -0.419512
						if( Positive_Money_Flow > 267355 )
							if( MFI_Low <= 28.1027 )
								if( Positive_Money_Flow_Sum <= 7.59742e+06 )
									ret := -0.368421
								if( Positive_Money_Flow_Sum > 7.59742e+06 )
									ret := -0.730337 // sell
							if( MFI_Low > 28.1027 )
								if( smoothD_d <= -1.75293 )
									ret := -0.980392 // sell
								if( smoothD_d > -1.75293 )
									ret := -0.687805
					if( MFI_High > -20.3129 )
						if( Raw_Money_Flow <= 388814 )
							if( rsi1 <= 30.5114 )
								if( Positive_Money_Flow_Sum <= 1.98722e+06 )
									ret := -0.566667
								if( Positive_Money_Flow_Sum > 1.98722e+06 )
									ret := -0.828358 // sell
							if( rsi1 > 30.5114 )
								if( smoothK_k <= -2.98857 )
									ret := -0.327586
								if( smoothK_k > -2.98857 )
									ret := -0.655914
						if( Raw_Money_Flow > 388814 )
							if( Negative_Money_Flow <= 414762 )
								if( Positive_Money_Flow_Sum <= 2.86483e+06 )
									ret := -0.609756
								if( Positive_Money_Flow_Sum > 2.86483e+06 )
									ret := -0.858672 // sell
							if( Negative_Money_Flow > 414762 )
								if( d_k <= -5.68824 )
									ret := -0.052632
								if( d_k > -5.68824 )
									ret := -0.703586 // sell
		if( rsi1 > 45.2365 )
			if( Negative_Money_Flow <= 9198.79 )
				if( MFI_High <= -6.10704 )
					if( Positive_Money_Flow <= 844064 )
						if( MFI_High <= -28.374 )
							if( Negative_Money_Flow_Sum <= 1.49372e+06 )
								if( rsi1 <= 57.2372 )
									ret := -0.100601
								if( rsi1 > 57.2372 )
									ret := 0.196970
							if( Negative_Money_Flow_Sum > 1.49372e+06 )
								if( smoothK_k <= 32.7434 )
									ret := 0.051088
								if( smoothK_k > 32.7434 )
									ret := 0.302810
						if( MFI_High > -28.374 )
							if( smoothK_k <= 26.3332 )
								if( k <= 14.1938 )
									ret := -0.083333
								if( k > 14.1938 )
									ret := -0.232224
							if( smoothK_k > 26.3332 )
								if( Positive_Money_Flow <= 698916 )
									ret := -0.076401
								if( Positive_Money_Flow > 698916 )
									ret := 0.265823
					if( Positive_Money_Flow > 844064 )
						if( d_k <= 5.18051 )
							if( rsi1 <= 54.3041 )
								if( Typical_Price <= 23.8977 )
									ret := -0.103139
								if( Typical_Price > 23.8977 )
									ret := -0.384010
							if( rsi1 > 54.3041 )
								if( smoothD_d <= 17.1485 )
									ret := -0.098940
								if( smoothD_d > 17.1485 )
									ret := 0.189706
						if( d_k > 5.18051 )
							if( MFI <= 55.685 )
								if( MFI <= 45.0155 )
									ret := 0.525000
								if( MFI > 45.0155 )
									ret := -0.043689
							if( MFI > 55.685 )
								if( rsi1 <= 54.4004 )
									ret := -0.694215
								if( rsi1 > 54.4004 )
									ret := -0.049315
				if( MFI_High > -6.10704 )
					if( smoothD_d <= 53.6456 )
						if( Negative_Money_Flow_Sum <= 9.89171e+06 )
							if( rsi1 <= 63.1528 )
								if( Typical_Price <= 19.5139 )
									ret := -0.388350
								if( Typical_Price > 19.5139 )
									ret := -0.711133 // sell
							if( rsi1 > 63.1528 )
								if( Negative_Money_Flow_Sum <= 2.97942e+06 )
									ret := -0.093023
								if( Negative_Money_Flow_Sum > 2.97942e+06 )
									ret := -0.318421
						if( Negative_Money_Flow_Sum > 9.89171e+06 )
							if( Money_Flow_Ratio <= 3.28356 )
								if( Positive_Money_Flow_Sum <= 4.06988e+07 )
									ret := -0.848485 // sell
								if( Positive_Money_Flow_Sum > 4.06988e+07 )
									ret := 0.500000
							if( Money_Flow_Ratio > 3.28356 )
								if( MFI <= 80.7905 )
									ret := -0.831169 // sell
								if( MFI > 80.7905 )
									ret := -0.984848 // sell
					if( smoothD_d > 53.6456 )
						if( Positive_Money_Flow_Sum <= 8.8808e+06 )
							if( d_k <= 23.2842 )
								if( rsi1 <= 72.6469 )
									ret := -0.236025
								if( rsi1 > 72.6469 )
									ret := 0.777778 // buy
							if( d_k > 23.2842 )
								if( MFI_High <= 5.52239 )
									ret := 0.206897
								if( MFI_High > 5.52239 )
									ret := 0.681818
						if( Positive_Money_Flow_Sum > 8.8808e+06 )
							if( rsi1 <= 66.2814 )
								if( Typical_Price <= 49.0379 )
									ret := -0.730769 // sell
								if( Typical_Price > 49.0379 )
									ret := -1.000000 // sell
							if( rsi1 > 66.2814 )
								if( smoothD_d <= 57.824 )
									ret := -0.285714
								if( smoothD_d > 57.824 )
									ret := 0.515152
			if( Negative_Money_Flow > 9198.79 )
				if( rsi1 <= 55.5581 )
					if( MFI_Low <= 42.7529 )
						if( MFI_High <= -53.1992 )
							if( Negative_Money_Flow <= 224591 )
								if( d <= 35.694 )
									ret := -0.026316
								if( d > 35.694 )
									ret := 0.640000
							if( Negative_Money_Flow > 224591 )
								if( k <= 23.0359 )
									ret := 0.416667
								if( k > 23.0359 )
									ret := 0.895161 // buy
						if( MFI_High > -53.1992 )
							if( smoothK_k <= 29.7704 )
								if( Negative_Money_Flow_Sum <= 3.95916e+07 )
									ret := 0.006775
								if( Negative_Money_Flow_Sum > 3.95916e+07 )
									ret := -0.587302
							if( smoothK_k > 29.7704 )
								if( MFI_Low <= 28.578 )
									ret := 0.266994
								if( MFI_Low > 28.578 )
									ret := 0.066836
					if( MFI_Low > 42.7529 )
						if( Raw_Money_Flow <= 182571 )
							if( rsi1 <= 47.1941 )
								if( Money_Flow_Ratio <= 1.94988 )
									ret := 0.058824
								if( Money_Flow_Ratio > 1.94988 )
									ret := -0.408163
							if( rsi1 > 47.1941 )
								if( Negative_Money_Flow_Sum <= 926128 )
									ret := -0.139706
								if( Negative_Money_Flow_Sum > 926128 )
									ret := 0.294574
						if( Raw_Money_Flow > 182571 )
							if( d_k <= 13.455 )
								if( MFI <= 76.2064 )
									ret := -0.411638
								if( MFI > 76.2064 )
									ret := -0.738532 // sell
							if( d_k > 13.455 )
								if( Negative_Money_Flow_Sum <= 1.13255e+07 )
									ret := -0.274262
								if( Negative_Money_Flow_Sum > 1.13255e+07 )
									ret := 0.649123
				if( rsi1 > 55.5581 )
					if( d_k <= -1.86466 )
						if( Positive_Money_Flow_Sum <= 1.74804e+07 )
							if( MFI <= 51.5269 )
								if( Typical_Price <= 21.3967 )
									ret := 0.362832
								if( Typical_Price > 21.3967 )
									ret := 0.761364 // buy
							if( MFI > 51.5269 )
								if( MFI <= 54.5939 )
									ret := -0.166667
								if( MFI > 54.5939 )
									ret := 0.263083
						if( Positive_Money_Flow_Sum > 1.74804e+07 )
							if( Money_Flow_Ratio <= 2.83173 )
								if( rsi1 <= 57.0729 )
									ret := 0.583333
								if( rsi1 > 57.0729 )
									ret := 0.863636 // buy
							if( Money_Flow_Ratio > 2.83173 )
								if( Raw_Money_Flow <= 1.83919e+06 )
									ret := 0.230769
								if( Raw_Money_Flow > 1.83919e+06 )
									ret := -0.384615
					if( d_k > -1.86466 )
						if( MFI <= 78.3631 )
							if( k <= 18.6376 )
								if( Typical_Price <= 28.9282 )
									ret := -0.097686
								if( Typical_Price > 28.9282 )
									ret := 0.298611
							if( k > 18.6376 )
								if( rsi1 <= 59.6917 )
									ret := 0.145669
								if( rsi1 > 59.6917 )
									ret := 0.343808
						if( MFI > 78.3631 )
							if( Money_Flow_Ratio <= 4.4456 )
								if( Positive_Money_Flow_Sum <= 9.57241e+06 )
									ret := 0.120000
								if( Positive_Money_Flow_Sum > 9.57241e+06 )
									ret := -0.682540
							if( Money_Flow_Ratio > 4.4456 )
								if( Negative_Money_Flow <= 1.97783e+06 )
									ret := 0.059041
								if( Negative_Money_Flow > 1.97783e+06 )
									ret := -0.838710 // sell
	if( k > 53.1509 )
		if( rsi1 <= 57.1553 )
			if( MFI_Low <= 20.0597 )
				if( rsi1 <= 46.4987 )
					if( MFI_High <= -53.5408 )
						if( rsi1 <= 36.4371 )
							if( Positive_Money_Flow <= 880.379 )
								if( rsi1 <= 20.6288 )
									ret := -0.474576
								if( rsi1 > 20.6288 )
									ret := 0.216272
							if( Positive_Money_Flow > 880.379 )
								if( rsi1 <= 24.5819 )
									ret := -0.746988 // sell
								if( rsi1 > 24.5819 )
									ret := -0.130621
						if( rsi1 > 36.4371 )
							if( Raw_Money_Flow <= 294991 )
								if( Raw_Money_Flow <= 288501 )
									ret := 0.166443
								if( Raw_Money_Flow > 288501 )
									ret := -0.823529 // sell
							if( Raw_Money_Flow > 294991 )
								if( Negative_Money_Flow <= 1.00186e+06 )
									ret := 0.431579
								if( Negative_Money_Flow > 1.00186e+06 )
									ret := 0.807407 // buy
					if( MFI_High > -53.5408 )
						if( rsi1 <= 38.2181 )
							if( Positive_Money_Flow <= 135380 )
								if( MFI_Low <= 9.69864 )
									ret := 0.081081
								if( MFI_Low > 9.69864 )
									ret := -0.231975
							if( Positive_Money_Flow > 135380 )
								if( Raw_Money_Flow <= 1.55438e+06 )
									ret := -0.441860
								if( Raw_Money_Flow > 1.55438e+06 )
									ret := -0.082474
						if( rsi1 > 38.2181 )
							if( Raw_Money_Flow <= 1.94279e+06 )
								if( Negative_Money_Flow_Sum <= 7.45593e+06 )
									ret := 0.065426
								if( Negative_Money_Flow_Sum > 7.45593e+06 )
									ret := -0.176471
							if( Raw_Money_Flow > 1.94279e+06 )
								if( Typical_Price <= 51.7109 )
									ret := 0.589212
								if( Typical_Price > 51.7109 )
									ret := -0.371429
				if( rsi1 > 46.4987 )
					if( Negative_Money_Flow <= 230551 )
						if( Negative_Money_Flow_Sum <= 2.4028e+06 )
							if( Positive_Money_Flow_Sum <= 1.41882e+06 )
								if( MFI_Low <= 11.1716 )
									ret := 0.228637
								if( MFI_Low > 11.1716 )
									ret := 0.100917
							if( Positive_Money_Flow_Sum > 1.41882e+06 )
								ret := 0.909091 // buy
						if( Negative_Money_Flow_Sum > 2.4028e+06 )
							if( Raw_Money_Flow <= 951752 )
								if( MFI_Low <= 14.6262 )
									ret := 0.392358
								if( MFI_Low > 14.6262 )
									ret := 0.179487
							if( Raw_Money_Flow > 951752 )
								if( d_k <= -20.1032 )
									ret := -0.166667
								if( d_k > -20.1032 )
									ret := 0.664414
					if( Negative_Money_Flow > 230551 )
						if( MFI_High <= -45.8308 )
							if( Raw_Money_Flow <= 956210 )
								if( Negative_Money_Flow_Sum <= 2.10669e+07 )
									ret := 0.702364 // buy
								if( Negative_Money_Flow_Sum > 2.10669e+07 )
									ret := -0.266667
							if( Raw_Money_Flow > 956210 )
								if( d_k <= 6.89904 )
									ret := 0.900515 // buy
								if( d_k > 6.89904 )
									ret := 0.100000
						if( MFI_High > -45.8308 )
							if( smoothK_k <= 76.3344 )
								if( Negative_Money_Flow_Sum <= 6.68896e+06 )
									ret := 0.698980
								if( Negative_Money_Flow_Sum > 6.68896e+06 )
									ret := 0.258427
							if( smoothK_k > 76.3344 )
								if( Positive_Money_Flow_Sum <= 1.39247e+07 )
									ret := 0.745455 // buy
								if( Positive_Money_Flow_Sum > 1.39247e+07 )
									ret := 0.391304
			if( MFI_Low > 20.0597 )
				if( rsi1 <= 49.979 )
					if( Negative_Money_Flow <= 66542.7 )
						if( Typical_Price <= 32.6374 )
							if( d_k <= -14.1998 )
								if( Positive_Money_Flow <= 2.15763e+06 )
									ret := -0.028269
								if( Positive_Money_Flow > 2.15763e+06 )
									ret := 0.947368 // buy
							if( d_k > -14.1998 )
								if( smoothD_d <= 78.382 )
									ret := -0.302556
								if( smoothD_d > 78.382 )
									ret := -0.042945
						if( Typical_Price > 32.6374 )
							if( MFI_High <= -36.7977 )
								if( d <= 68.6595 )
									ret := -0.375000
								if( d > 68.6595 )
									ret := 0.313433
							if( MFI_High > -36.7977 )
								if( Positive_Money_Flow_Sum <= 4.99915e+07 )
									ret := -0.585145
								if( Positive_Money_Flow_Sum > 4.99915e+07 )
									ret := 0.440000
					if( Negative_Money_Flow > 66542.7 )
						if( k <= 72.4108 )
							if( MFI <= 63.4052 )
								if( Positive_Money_Flow_Sum <= 4.7079e+07 )
									ret := -0.112538
								if( Positive_Money_Flow_Sum > 4.7079e+07 )
									ret := 0.666667
							if( MFI > 63.4052 )
								if( MFI <= 68.5194 )
									ret := -0.702128 // sell
								if( MFI > 68.5194 )
									ret := -0.272727
						if( k > 72.4108 )
							if( Negative_Money_Flow_Sum <= 5.34909e+06 )
								if( Negative_Money_Flow_Sum <= 4.39752e+06 )
									ret := -0.010331
								if( Negative_Money_Flow_Sum > 4.39752e+06 )
									ret := 0.723404 // buy
							if( Negative_Money_Flow_Sum > 5.34909e+06 )
								if( Raw_Money_Flow <= 659557 )
									ret := -0.384058
								if( Raw_Money_Flow > 659557 )
									ret := 0.036036
				if( rsi1 > 49.979 )
					if( Money_Flow_Ratio <= 1.30817 )
						if( MFI_High <= -34.6574 )
							if( Money_Flow_Ratio <= 0.703546 )
								if( MFI_High <= -38.8402 )
									ret := 0.171687
								if( MFI_High > -38.8402 )
									ret := -0.292683
							if( Money_Flow_Ratio > 0.703546 )
								if( Money_Flow_Ratio <= 0.718325 )
									ret := 0.608333
								if( Money_Flow_Ratio > 0.718325 )
									ret := 0.313976
						if( MFI_High > -34.6574 )
							if( Positive_Money_Flow_Sum <= 2.19273e+07 )
								if( Positive_Money_Flow_Sum <= 1.46987e+07 )
									ret := 0.076696
								if( Positive_Money_Flow_Sum > 1.46987e+07 )
									ret := 0.430939
							if( Positive_Money_Flow_Sum > 2.19273e+07 )
								if( Positive_Money_Flow_Sum <= 2.63896e+07 )
									ret := -0.818182 // sell
								if( Positive_Money_Flow_Sum > 2.63896e+07 )
									ret := -0.031746
					if( Money_Flow_Ratio > 1.30817 )
						if( MFI_High <= -11.3374 )
							if( Raw_Money_Flow <= 589196 )
								if( Money_Flow_Ratio <= 2.01606 )
									ret := -0.056574
								if( Money_Flow_Ratio > 2.01606 )
									ret := 0.400000
							if( Raw_Money_Flow > 589196 )
								if( d_k <= 13.3175 )
									ret := -0.241611
								if( d_k > 13.3175 )
									ret := 0.285714
						if( MFI_High > -11.3374 )
							if( smoothD_d <= 72.8056 )
								if( Raw_Money_Flow <= 140296 )
									ret := -0.079208
								if( Raw_Money_Flow > 140296 )
									ret := -0.624031
							if( smoothD_d > 72.8056 )
								if( Raw_Money_Flow <= 935943 )
									ret := -0.023529
								if( Raw_Money_Flow > 935943 )
									ret := -0.583333
		if( rsi1 > 57.1553 )
			if( MFI <= 57.3399 )
				if( MFI_Low <= 18.5876 )
					if( Positive_Money_Flow_Sum <= 822807 )
						if( Negative_Money_Flow <= 105746 )
							if( d <= 94.3651 )
								if( Raw_Money_Flow <= 66469.1 )
									ret := 0.225806
								if( Raw_Money_Flow > 66469.1 )
									ret := 0.529661
							if( d > 94.3651 )
								if( Positive_Money_Flow_Sum <= 564499 )
									ret := 0.059524
								if( Positive_Money_Flow_Sum > 564499 )
									ret := 0.258065
						if( Negative_Money_Flow > 105746 )
							if( d <= 67.6398 )
								if( smoothK_k <= 64.8382 )
									ret := 0.800000 // buy
								if( smoothK_k > 64.8382 )
									ret := 0.125000
							if( d > 67.6398 )
								if( rsi1 <= 70.7108 )
									ret := 0.684211
								if( rsi1 > 70.7108 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 822807 )
						if( Negative_Money_Flow_Sum <= 3.47699e+06 )
							if( rsi1 <= 61.3729 )
								if( d <= 94.6187 )
									ret := 0.638037
								if( d > 94.6187 )
									ret := 0.130435
							if( rsi1 > 61.3729 )
								if( d_k <= -22.7516 )
									ret := 0.200000
								if( d_k > -22.7516 )
									ret := 0.756691 // buy
						if( Negative_Money_Flow_Sum > 3.47699e+06 )
							if( Typical_Price <= 20.0465 )
								if( d_k <= 3.92868 )
									ret := 0.632479
								if( d_k > 3.92868 )
									ret := 0.050000
							if( Typical_Price > 20.0465 )
								if( d_k <= 9.27296 )
									ret := 0.841176 // buy
								if( d_k > 9.27296 )
									ret := 0.166667
				if( MFI_Low > 18.5876 )
					if( Typical_Price <= 58.1499 )
						if( Negative_Money_Flow_Sum <= 505361 )
							if( rsi1 <= 75.3584 )
								if( Negative_Money_Flow <= 60452.4 )
									ret := 0.034221
								if( Negative_Money_Flow > 60452.4 )
									ret := 0.314286
							if( rsi1 > 75.3584 )
								if( Positive_Money_Flow <= 98995.6 )
									ret := 0.592593
								if( Positive_Money_Flow > 98995.6 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 505361 )
							if( Typical_Price <= 26.3469 )
								if( Positive_Money_Flow <= 453292 )
									ret := 0.519915
								if( Positive_Money_Flow > 453292 )
									ret := 0.339372
							if( Typical_Price > 26.3469 )
								if( Positive_Money_Flow_Sum <= 5.48406e+07 )
									ret := 0.637363
								if( Positive_Money_Flow_Sum > 5.48406e+07 )
									ret := -0.545455
					if( Typical_Price > 58.1499 )
						if( MFI <= 52.9002 )
							if( Positive_Money_Flow_Sum <= 5.1929e+06 )
								ret := -0.125000
							if( Positive_Money_Flow_Sum > 5.1929e+06 )
								if( Positive_Money_Flow <= 1.2968e+06 )
									ret := -0.928571 // sell
								if( Positive_Money_Flow > 1.2968e+06 )
									ret := 0.200000
						if( MFI > 52.9002 )
							if( Negative_Money_Flow <= 322039 )
								ret := 0.000000
							if( Negative_Money_Flow > 322039 )
								ret := 0.416667
			if( MFI > 57.3399 )
				if( smoothD_d <= 80.1292 )
					if( MFI <= 72.0421 )
						if( Money_Flow_Ratio <= 1.91721 )
							if( smoothD_d <= 52.6737 )
								if( MFI <= 64.5599 )
									ret := 0.055263
								if( MFI > 64.5599 )
									ret := 0.357143
							if( smoothD_d > 52.6737 )
								if( Positive_Money_Flow <= 340627 )
									ret := 0.416076
								if( Positive_Money_Flow > 340627 )
									ret := 0.188900
						if( Money_Flow_Ratio > 1.91721 )
							if( MFI <= 67.5225 )
								if( rsi1 <= 67.8718 )
									ret := -0.088553
								if( rsi1 > 67.8718 )
									ret := 0.358423
							if( MFI > 67.5225 )
								if( Positive_Money_Flow_Sum <= 2.68909e+07 )
									ret := 0.225282
								if( Positive_Money_Flow_Sum > 2.68909e+07 )
									ret := 0.590476
					if( MFI > 72.0421 )
						if( MFI_Low <= 63.7365 )
							if( rsi1 <= 70.5329 )
								if( Raw_Money_Flow <= 1.11312e+06 )
									ret := -0.009608
								if( Raw_Money_Flow > 1.11312e+06 )
									ret := -0.423868
							if( rsi1 > 70.5329 )
								if( rsi1 <= 76.4925 )
									ret := 0.184211
								if( rsi1 > 76.4925 )
									ret := 0.535019
						if( MFI_Low > 63.7365 )
							if( Positive_Money_Flow <= 321001 )
								if( Raw_Money_Flow <= 103194 )
									ret := -0.483871
								if( Raw_Money_Flow > 103194 )
									ret := 0.176923
							if( Positive_Money_Flow > 321001 )
								if( rsi1 <= 76.7996 )
									ret := -0.426396
								if( rsi1 > 76.7996 )
									ret := 0.074380
				if( smoothD_d > 80.1292 )
					if( Raw_Money_Flow <= 111923 )
						if( smoothD_d <= 90.6461 )
							if( Typical_Price <= 11.7631 )
								if( rsi1 <= 73.5194 )
									ret := 0.111111
								if( rsi1 > 73.5194 )
									ret := 0.780488 // buy
							if( Typical_Price > 11.7631 )
								if( rsi1 <= 81.2947 )
									ret := -0.022113
								if( rsi1 > 81.2947 )
									ret := 0.703704 // buy
						if( smoothD_d > 90.6461 )
							if( rsi1 <= 72.0465 )
								if( smoothK_k <= 87.4983 )
									ret := 0.406250
								if( smoothK_k > 87.4983 )
									ret := -0.031056
							if( rsi1 > 72.0465 )
								if( Typical_Price <= 12.5178 )
									ret := 0.669355
								if( Typical_Price > 12.5178 )
									ret := 0.277778
					if( Raw_Money_Flow > 111923 )
						if( Positive_Money_Flow_Sum <= 2.15034e+07 )
							if( rsi1 <= 69.1234 )
								if( MFI <= 69.6103 )
									ret := 0.258577
								if( MFI > 69.6103 )
									ret := 0.029548
							if( rsi1 > 69.1234 )
								if( MFI <= 70.0457 )
									ret := 0.650938
								if( MFI > 70.0457 )
									ret := 0.370675
						if( Positive_Money_Flow_Sum > 2.15034e+07 )
							if( MFI_High <= -11.3986 )
								if( Negative_Money_Flow_Sum <= 1.68843e+07 )
									ret := 0.830303 // buy
								if( Negative_Money_Flow_Sum > 1.68843e+07 )
									ret := 0.513889
							if( MFI_High > -11.3986 )
								if( Negative_Money_Flow <= 2.36004e+06 )
									ret := 0.503215
								if( Negative_Money_Flow > 2.36004e+06 )
									ret := -0.121622
	
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
float op_operation = decision_tree_0_AVAXUSDT_15Min_c265f285(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


