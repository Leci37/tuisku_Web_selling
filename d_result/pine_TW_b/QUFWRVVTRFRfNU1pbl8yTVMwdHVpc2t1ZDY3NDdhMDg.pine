//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AAVEUSDT_5Min_2MS0_d6747a08 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_5Min_2MS0_d6747a08", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_5Min_d6747a08(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 75.3094 )
		if( rsi1 <= 43.3932 )
			if( MFI_Low <= 13.7599 )
				if( d_k <= -3.31535 )
					if( Positive_Money_Flow <= 554.648 )
						if( Negative_Money_Flow <= 55378.1 )
							if( d_k <= -7.9577 )
								if( MFI_High <= -60.3509 )
									ret := 0.538915
								if( MFI_High > -60.3509 )
									ret := 0.258940
							if( d_k > -7.9577 )
								if( smoothD_d <= 49.2594 )
									ret := 0.190409
								if( smoothD_d > 49.2594 )
									ret := -0.318584
						if( Negative_Money_Flow > 55378.1 )
							if( smoothD_d <= 1.71811 )
								if( rsi1 <= 13.9892 )
									ret := -0.666667
								if( rsi1 > 13.9892 )
									ret := 0.159184
							if( smoothD_d > 1.71811 )
								if( Raw_Money_Flow <= 150273 )
									ret := 0.552323
								if( Raw_Money_Flow > 150273 )
									ret := 0.687104
					if( Positive_Money_Flow > 554.648 )
						if( rsi1 <= 34.7202 )
							if( smoothD_d <= 8.29948 )
								if( Negative_Money_Flow <= 27.5093 )
									ret := 0.056555
								if( Negative_Money_Flow > 27.5093 )
									ret := 0.692308
							if( smoothD_d > 8.29948 )
								if( d_k <= -10.8964 )
									ret := -0.095930
								if( d_k > -10.8964 )
									ret := -0.529111
						if( rsi1 > 34.7202 )
							if( Money_Flow_Ratio <= 0.110541 )
								if( Raw_Money_Flow <= 5604.05 )
									ret := 0.380952
								if( Raw_Money_Flow > 5604.05 )
									ret := 0.791667 // buy
							if( Money_Flow_Ratio > 0.110541 )
								if( d <= 45.9954 )
									ret := 0.233715
								if( d > 45.9954 )
									ret := -0.138053
				if( d_k > -3.31535 )
					if( d_k <= -0.44794 )
						if( Negative_Money_Flow <= 4089.58 )
							if( smoothD_d <= 3.43303 )
								if( Positive_Money_Flow_Sum <= 252044 )
									ret := -0.176471
								if( Positive_Money_Flow_Sum > 252044 )
									ret := -0.480000
							if( smoothD_d > 3.43303 )
								if( smoothD_d <= 63.9168 )
									ret := -0.551607
								if( smoothD_d > 63.9168 )
									ret := 0.023256
						if( Negative_Money_Flow > 4089.58 )
							if( k <= 7.70753 )
								if( rsi1 <= 26.7965 )
									ret := -0.416779
								if( rsi1 > 26.7965 )
									ret := -0.017021
							if( k > 7.70753 )
								if( Negative_Money_Flow <= 496175 )
									ret := -0.043783
								if( Negative_Money_Flow > 496175 )
									ret := 0.750000 // buy
					if( d_k > -0.44794 )
						if( Typical_Price <= 79.8804 )
							if( Negative_Money_Flow_Sum <= 958183 )
								if( Typical_Price <= 74.7508 )
									ret := -0.281855
								if( Typical_Price > 74.7508 )
									ret := -0.549107
							if( Negative_Money_Flow_Sum > 958183 )
								if( d <= 11.1393 )
									ret := -0.318182
								if( d > 11.1393 )
									ret := 0.412844
						if( Typical_Price > 79.8804 )
							if( MFI <= 28.0122 )
								if( Positive_Money_Flow_Sum <= 348714 )
									ret := -0.618240
								if( Positive_Money_Flow_Sum > 348714 )
									ret := -0.710376 // sell
							if( MFI > 28.0122 )
								if( rsi1 <= 33.0331 )
									ret := -0.690009
								if( rsi1 > 33.0331 )
									ret := -0.328032
			if( MFI_Low > 13.7599 )
				if( d_k <= -0.62982 )
					if( d <= 29.5061 )
						if( k <= 8.6142 )
							if( d <= 5.42401 )
								if( rsi1 <= 37.1765 )
									ret := -0.218299
								if( rsi1 > 37.1765 )
									ret := 0.046272
							if( d > 5.42401 )
								if( MFI_Low <= 25.2605 )
									ret := -0.246914
								if( MFI_Low > 25.2605 )
									ret := -0.594937
						if( k > 8.6142 )
							if( Raw_Money_Flow <= 103973 )
								if( Negative_Money_Flow <= 9468.8 )
									ret := -0.140845
								if( Negative_Money_Flow > 9468.8 )
									ret := 0.205788
							if( Raw_Money_Flow > 103973 )
								if( Typical_Price <= 117.837 )
									ret := 0.421594
								if( Typical_Price > 117.837 )
									ret := -0.076233
					if( d > 29.5061 )
						if( Positive_Money_Flow <= 5674.41 )
							if( rsi1 <= 40.4722 )
								if( Raw_Money_Flow <= 50182.8 )
									ret := -0.264935
								if( Raw_Money_Flow > 50182.8 )
									ret := 0.072000
							if( rsi1 > 40.4722 )
								if( Negative_Money_Flow_Sum <= 168732 )
									ret := -0.066176
								if( Negative_Money_Flow_Sum > 168732 )
									ret := 0.280000
						if( Positive_Money_Flow > 5674.41 )
							if( MFI_Low <= 15.6253 )
								if( Raw_Money_Flow <= 115934 )
									ret := -0.385965
								if( Raw_Money_Flow > 115934 )
									ret := 0.260870
							if( MFI_Low > 15.6253 )
								if( Positive_Money_Flow_Sum <= 220025 )
									ret := -0.266484
								if( Positive_Money_Flow_Sum > 220025 )
									ret := -0.505051
				if( d_k > -0.62982 )
					if( Positive_Money_Flow <= 8441.58 )
						if( d <= 20.5372 )
							if( d_k <= 0.509667 )
								if( Negative_Money_Flow <= 11517 )
									ret := -0.146635
								if( Negative_Money_Flow > 11517 )
									ret := -0.365110
							if( d_k > 0.509667 )
								if( rsi1 <= 33.6545 )
									ret := -0.642638
								if( rsi1 > 33.6545 )
									ret := -0.389432
						if( d > 20.5372 )
							if( Negative_Money_Flow <= 17614.1 )
								if( Positive_Money_Flow_Sum <= 43337.9 )
									ret := -0.329020
								if( Positive_Money_Flow_Sum > 43337.9 )
									ret := -0.574301
							if( Negative_Money_Flow > 17614.1 )
								if( d_k <= 2.1858 )
									ret := -0.134663
								if( d_k > 2.1858 )
									ret := -0.677238
					if( Positive_Money_Flow > 8441.58 )
						if( Typical_Price <= 71.1219 )
							if( Raw_Money_Flow <= 36282.2 )
								if( d_k <= 17.9165 )
									ret := -0.372727
								if( d_k > 17.9165 )
									ret := 0.142857
							if( Raw_Money_Flow > 36282.2 )
								if( rsi1 <= 38.1202 )
									ret := -0.797101 // sell
								if( rsi1 > 38.1202 )
									ret := 0.263158
						if( Typical_Price > 71.1219 )
							if( Positive_Money_Flow_Sum <= 5.048e+06 )
								if( d <= 33.6274 )
									ret := -0.654228
								if( d > 33.6274 )
									ret := -0.793343 // sell
							if( Positive_Money_Flow_Sum > 5.048e+06 )
								if( smoothK_k <= 11.5588 )
									ret := -0.375000
								if( smoothK_k > 11.5588 )
									ret := 0.529412
		if( rsi1 > 43.3932 )
			if( d_k <= 1.72934 )
				if( d_k <= -6.30668 )
					if( Money_Flow_Ratio <= 0.569757 )
						if( Raw_Money_Flow <= 20180 )
							if( Raw_Money_Flow <= 3074.69 )
								if( Typical_Price <= 58.9438 )
									ret := 0.163462
								if( Typical_Price > 58.9438 )
									ret := 0.456621
							if( Raw_Money_Flow > 3074.69 )
								if( d_k <= -16.042 )
									ret := 0.722508 // buy
								if( d_k > -16.042 )
									ret := 0.531822
						if( Raw_Money_Flow > 20180 )
							if( smoothD_d <= 4.9217 )
								if( Typical_Price <= 111.731 )
									ret := 0.358491
								if( Typical_Price > 111.731 )
									ret := 0.785714 // buy
							if( smoothD_d > 4.9217 )
								if( d_k <= -12.5267 )
									ret := 0.791772 // buy
								if( d_k > -12.5267 )
									ret := 0.694388
					if( Money_Flow_Ratio > 0.569757 )
						if( MFI <= 67.8409 )
							if( Positive_Money_Flow <= 871.093 )
								if( smoothD_d <= 4.83911 )
									ret := 0.363636
								if( smoothD_d > 4.83911 )
									ret := 0.685208
							if( Positive_Money_Flow > 871.093 )
								if( Typical_Price <= 75.1193 )
									ret := 0.244970
								if( Typical_Price > 75.1193 )
									ret := 0.483820
						if( MFI > 67.8409 )
							if( Negative_Money_Flow_Sum <= 49101.7 )
								if( k <= 70.115 )
									ret := 0.205882
								if( k > 70.115 )
									ret := -0.128205
							if( Negative_Money_Flow_Sum > 49101.7 )
								if( rsi1 <= 65.1088 )
									ret := 0.260028
								if( rsi1 > 65.1088 )
									ret := 0.685135
				if( d_k > -6.30668 )
					if( k <= 7.61485 )
						if( Positive_Money_Flow_Sum <= 9.51625e+06 )
							if( smoothK_k <= -1.73111 )
								if( rsi1 <= 53.9258 )
									ret := -0.282528
								if( rsi1 > 53.9258 )
									ret := 0.078652
							if( smoothK_k > -1.73111 )
								if( d_k <= -0.363199 )
									ret := 0.139738
								if( d_k > -0.363199 )
									ret := -0.065440
						if( Positive_Money_Flow_Sum > 9.51625e+06 )
							ret := -1.000000 // sell
					if( k > 7.61485 )
						if( Negative_Money_Flow <= 2349.95 )
							if( rsi1 <= 57.8451 )
								if( d_k <= -0.723296 )
									ret := 0.043912
								if( d_k > -0.723296 )
									ret := -0.294230
							if( rsi1 > 57.8451 )
								if( Negative_Money_Flow_Sum <= 386358 )
									ret := 0.363226
								if( Negative_Money_Flow_Sum > 386358 )
									ret := 0.585702
						if( Negative_Money_Flow > 2349.95 )
							if( Negative_Money_Flow <= 17351.7 )
								if( rsi1 <= 54.6852 )
									ret := 0.292094
								if( rsi1 > 54.6852 )
									ret := 0.628060
							if( Negative_Money_Flow > 17351.7 )
								if( rsi1 <= 57.5698 )
									ret := 0.492529
								if( rsi1 > 57.5698 )
									ret := 0.783188 // buy
			if( d_k > 1.72934 )
				if( d_k <= 10.3588 )
					if( d <= 80.8306 )
						if( Positive_Money_Flow <= 2384.82 )
							if( smoothK_k <= 1.50158 )
								if( Raw_Money_Flow <= 28966.7 )
									ret := -0.072948
								if( Raw_Money_Flow > 28966.7 )
									ret := -0.359060
							if( smoothK_k > 1.50158 )
								if( MFI <= 59.0779 )
									ret := 0.066101
								if( MFI > 59.0779 )
									ret := 0.253031
						if( Positive_Money_Flow > 2384.82 )
							if( d_k <= 5.76952 )
								if( Positive_Money_Flow_Sum <= 3.19608e+06 )
									ret := -0.317187
								if( Positive_Money_Flow_Sum > 3.19608e+06 )
									ret := 0.227129
							if( d_k > 5.76952 )
								if( rsi1 <= 66.2868 )
									ret := -0.577396
								if( rsi1 > 66.2868 )
									ret := -0.093985
					if( d > 80.8306 )
						if( Negative_Money_Flow <= 1627.88 )
							if( rsi1 <= 72.5783 )
								if( Positive_Money_Flow <= 7426.81 )
									ret := -0.301587
								if( Positive_Money_Flow > 7426.81 )
									ret := -0.739130 // sell
							if( rsi1 > 72.5783 )
								if( Positive_Money_Flow_Sum <= 739521 )
									ret := 0.062500
								if( Positive_Money_Flow_Sum > 739521 )
									ret := -0.416667
						if( Negative_Money_Flow > 1627.88 )
							if( MFI <= 84.7688 )
								if( k <= 71.3714 )
									ret := 0.428571
								if( k > 71.3714 )
									ret := -0.270588
							if( MFI > 84.7688 )
								if( d <= 83.3408 )
									ret := 0.666667
								if( d > 83.3408 )
									ret := 0.095238
				if( d_k > 10.3588 )
					if( smoothD_d <= 44.3144 )
						if( MFI_High <= -21.8381 )
							if( Negative_Money_Flow <= 433.327 )
								if( MFI_High <= -33.5687 )
									ret := -0.020408
								if( MFI_High > -33.5687 )
									ret := -0.466368
							if( Negative_Money_Flow > 433.327 )
								if( Positive_Money_Flow_Sum <= 2.98798e+06 )
									ret := -0.016225
								if( Positive_Money_Flow_Sum > 2.98798e+06 )
									ret := -0.866667 // sell
						if( MFI_High > -21.8381 )
							if( Positive_Money_Flow <= 20302.1 )
								if( Typical_Price <= 83.2005 )
									ret := -0.109244
								if( Typical_Price > 83.2005 )
									ret := -0.325412
							if( Positive_Money_Flow > 20302.1 )
								if( smoothD_d <= 22.0588 )
									ret := -0.423841
								if( smoothD_d > 22.0588 )
									ret := -0.696888
					if( smoothD_d > 44.3144 )
						if( MFI_High <= -5.17505 )
							if( Positive_Money_Flow_Sum <= 150428 )
								if( MFI_High <= -41.0422 )
									ret := -0.024390
								if( MFI_High > -41.0422 )
									ret := -0.290574
							if( Positive_Money_Flow_Sum > 150428 )
								if( Negative_Money_Flow <= 2371.02 )
									ret := -0.703057 // sell
								if( Negative_Money_Flow > 2371.02 )
									ret := -0.389367
						if( MFI_High > -5.17505 )
							if( d_k <= 13.3514 )
								if( Negative_Money_Flow <= 423.73 )
									ret := -0.707715 // sell
								if( Negative_Money_Flow > 423.73 )
									ret := -0.252874
							if( d_k > 13.3514 )
								if( Positive_Money_Flow <= 27.4436 )
									ret := -0.568273
								if( Positive_Money_Flow > 27.4436 )
									ret := -0.807886 // sell
	if( k > 75.3094 )
		if( Negative_Money_Flow <= 11204.7 )
			if( d_k <= 1.26352 )
				if( Positive_Money_Flow <= 8212.73 )
					if( Negative_Money_Flow <= 0.028899 )
						if( Typical_Price <= 73.1613 )
							if( Raw_Money_Flow <= 6463.85 )
								if( k <= 99.0362 )
									ret := 0.106020
								if( k > 99.0362 )
									ret := 0.212963
							if( Raw_Money_Flow > 6463.85 )
								if( k <= 87.8063 )
									ret := -0.253333
								if( k > 87.8063 )
									ret := 0.030488
						if( Typical_Price > 73.1613 )
							if( rsi1 <= 57.272 )
								if( MFI_Low <= 9.18154 )
									ret := 0.170103
								if( MFI_Low > 9.18154 )
									ret := -0.123016
							if( rsi1 > 57.272 )
								if( rsi1 <= 68.0443 )
									ret := 0.337366
								if( rsi1 > 68.0443 )
									ret := 0.551880
					if( Negative_Money_Flow > 0.028899 )
						if( Positive_Money_Flow <= 0.628493 )
							if( Typical_Price <= 67.2485 )
								if( rsi1 <= 49.3711 )
									ret := -0.028169
								if( rsi1 > 49.3711 )
									ret := 0.215359
							if( Typical_Price > 67.2485 )
								if( smoothK_k <= 92.6864 )
									ret := 0.411719
								if( smoothK_k > 92.6864 )
									ret := 0.229911
						if( Positive_Money_Flow > 0.628493 )
							if( Negative_Money_Flow_Sum <= 384830 )
								if( smoothK_k <= 77.4435 )
									ret := 0.657895
								if( smoothK_k > 77.4435 )
									ret := 0.927632 // buy
							if( Negative_Money_Flow_Sum > 384830 )
								if( MFI_High <= -57.4463 )
									ret := 0.878788 // buy
								if( MFI_High > -57.4463 )
									ret := 0.315068
				if( Positive_Money_Flow > 8212.73 )
					if( MFI_High <= -28.0003 )
						if( smoothD_d <= 63.8661 )
							if( MFI <= 23.7706 )
								if( rsi1 <= 32.2106 )
									ret := -0.593220
								if( rsi1 > 32.2106 )
									ret := 0.476804
							if( MFI > 23.7706 )
								if( d_k <= -13.4913 )
									ret := 0.513514
								if( d_k > -13.4913 )
									ret := 0.226190
						if( smoothD_d > 63.8661 )
							if( MFI <= 31.7163 )
								if( Negative_Money_Flow_Sum <= 5.29034e+06 )
									ret := 0.205942
								if( Negative_Money_Flow_Sum > 5.29034e+06 )
									ret := -0.825000 // sell
							if( MFI > 31.7163 )
								if( k <= 89.1215 )
									ret := 0.120110
								if( k > 89.1215 )
									ret := 0.376815
					if( MFI_High > -28.0003 )
						if( rsi1 <= 64.9197 )
							if( d_k <= -7.43229 )
								if( rsi1 <= 55.7569 )
									ret := -0.026316
								if( rsi1 > 55.7569 )
									ret := 0.417421
							if( d_k > -7.43229 )
								if( MFI <= 55.5058 )
									ret := 0.217391
								if( MFI > 55.5058 )
									ret := -0.084797
						if( rsi1 > 64.9197 )
							if( rsi1 <= 77.1167 )
								if( MFI <= 72.9917 )
									ret := 0.603338
								if( MFI > 72.9917 )
									ret := 0.392914
							if( rsi1 > 77.1167 )
								if( Negative_Money_Flow_Sum <= 17055.1 )
									ret := 0.403101
								if( Negative_Money_Flow_Sum > 17055.1 )
									ret := 0.688280
			if( d_k > 1.26352 )
				if( d_k <= 4.68694 )
					if( MFI_High <= -24.7321 )
						if( k <= 92.5122 )
							if( Positive_Money_Flow_Sum <= 160558 )
								if( k <= 90.5365 )
									ret := -0.220779
								if( k > 90.5365 )
									ret := 0.051948
							if( Positive_Money_Flow_Sum > 160558 )
								if( Raw_Money_Flow <= 50361.9 )
									ret := -0.411444
								if( Raw_Money_Flow > 50361.9 )
									ret := -0.674658
						if( k > 92.5122 )
							if( Positive_Money_Flow_Sum <= 737892 )
								if( Money_Flow_Ratio <= 0.533068 )
									ret := 0.263889
								if( Money_Flow_Ratio > 0.533068 )
									ret := -0.089109
							if( Positive_Money_Flow_Sum > 737892 )
								if( d_k <= 1.40399 )
									ret := 0.111111
								if( d_k > 1.40399 )
									ret := -0.600000
					if( MFI_High > -24.7321 )
						if( Money_Flow_Ratio <= 9.09434 )
							if( Raw_Money_Flow <= 59234.6 )
								if( d_k <= 3.00772 )
									ret := 0.092265
								if( d_k > 3.00772 )
									ret := -0.036571
							if( Raw_Money_Flow > 59234.6 )
								if( MFI_Low <= 47.9662 )
									ret := -0.348066
								if( MFI_Low > 47.9662 )
									ret := -0.053061
						if( Money_Flow_Ratio > 9.09434 )
							if( smoothK_k <= 90.5333 )
								if( MFI_Low <= 70.5567 )
									ret := 0.628571
								if( MFI_Low > 70.5567 )
									ret := -0.014354
							if( smoothK_k > 90.5333 )
								if( smoothD_d <= 94.7698 )
									ret := 0.565657
								if( smoothD_d > 94.7698 )
									ret := 0.271845
				if( d_k > 4.68694 )
					if( Positive_Money_Flow_Sum <= 183291 )
						if( Positive_Money_Flow_Sum <= 54878.8 )
							if( d_k <= 8.09304 )
								if( Money_Flow_Ratio <= 0.448395 )
									ret := -0.250000
								if( Money_Flow_Ratio > 0.448395 )
									ret := -0.005556
							if( d_k > 8.09304 )
								if( Raw_Money_Flow <= 2035.01 )
									ret := -0.395349
								if( Raw_Money_Flow > 2035.01 )
									ret := -0.118421
						if( Positive_Money_Flow_Sum > 54878.8 )
							if( MFI <= 26.6439 )
								if( Negative_Money_Flow_Sum <= 376938 )
									ret := -0.071429
								if( Negative_Money_Flow_Sum > 376938 )
									ret := 0.642857
							if( MFI > 26.6439 )
								if( MFI <= 63.4743 )
									ret := -0.396304
								if( MFI > 63.4743 )
									ret := -0.176724
					if( Positive_Money_Flow_Sum > 183291 )
						if( Raw_Money_Flow <= 78156.9 )
							if( MFI_High <= -14.7656 )
								if( Typical_Price <= 78.2917 )
									ret := -0.033333
								if( Typical_Price > 78.2917 )
									ret := -0.610000
							if( MFI_High > -14.7656 )
								if( Negative_Money_Flow_Sum <= 359562 )
									ret := -0.411814
								if( Negative_Money_Flow_Sum > 359562 )
									ret := 0.090909
						if( Raw_Money_Flow > 78156.9 )
							if( MFI_Low <= 78.6606 )
								if( smoothD_d <= 91.2962 )
									ret := -0.705420 // sell
								if( smoothD_d > 91.2962 )
									ret := -0.404878
							if( MFI_Low > 78.6606 )
								ret := 0.300000
		if( Negative_Money_Flow > 11204.7 )
			if( d <= 80.4567 )
				if( Typical_Price <= 69.0214 )
					if( MFI_Low <= 14.4036 )
						if( Raw_Money_Flow <= 34506.8 )
							if( MFI <= 19.1371 )
								if( MFI <= 15.9301 )
									ret := 0.000000
								if( MFI > 15.9301 )
									ret := -0.222222
							if( MFI > 19.1371 )
								ret := 0.500000
						if( Raw_Money_Flow > 34506.8 )
							if( smoothD_d <= 64.3257 )
								ret := -0.181818
							if( smoothD_d > 64.3257 )
								ret := -0.866667 // sell
					if( MFI_Low > 14.4036 )
						if( MFI <= 61.8269 )
							if( k <= 85.7632 )
								if( Negative_Money_Flow_Sum <= 120237 )
									ret := 0.909091 // buy
								if( Negative_Money_Flow_Sum > 120237 )
									ret := 0.600000
							if( k > 85.7632 )
								if( d <= 74.3929 )
									ret := -0.250000
								if( d > 74.3929 )
									ret := 0.294118
						if( MFI > 61.8269 )
							if( smoothD_d <= 73.6803 )
								ret := 0.263158
							if( smoothD_d > 73.6803 )
								ret := -0.142857
				if( Typical_Price > 69.0214 )
					if( MFI_High <= -30.459 )
						if( rsi1 <= 42.6961 )
							if( MFI <= 26.418 )
								if( rsi1 <= 25.446 )
									ret := -0.516129
								if( rsi1 > 25.446 )
									ret := 0.462963
							if( MFI > 26.418 )
								if( Money_Flow_Ratio <= 0.792897 )
									ret := -0.095890
								if( Money_Flow_Ratio > 0.792897 )
									ret := -0.777778 // sell
						if( rsi1 > 42.6961 )
							if( Money_Flow_Ratio <= 0.624074 )
								if( d <= 77.1942 )
									ret := 0.761364 // buy
								if( d > 77.1942 )
									ret := 0.566210
							if( Money_Flow_Ratio > 0.624074 )
								if( rsi1 <= 52.3236 )
									ret := 0.270718
								if( rsi1 > 52.3236 )
									ret := 0.672289
					if( MFI_High > -30.459 )
						if( rsi1 <= 59.8826 )
							if( Money_Flow_Ratio <= 1.42957 )
								if( d <= 77.685 )
									ret := 0.715232 // buy
								if( d > 77.685 )
									ret := 0.438596
							if( Money_Flow_Ratio > 1.42957 )
								if( Typical_Price <= 105.06 )
									ret := 0.457627
								if( Typical_Price > 105.06 )
									ret := -0.026316
						if( rsi1 > 59.8826 )
							if( k <= 91.12 )
								if( smoothD_d <= 66.028 )
									ret := 0.741667 // buy
								if( smoothD_d > 66.028 )
									ret := 0.870690 // buy
							if( k > 91.12 )
								if( Negative_Money_Flow <= 25106.6 )
									ret := 0.555556
								if( Negative_Money_Flow > 25106.6 )
									ret := 0.222222
			if( d > 80.4567 )
				if( rsi1 <= 57.9347 )
					if( d_k <= 0.735787 )
						if( d_k <= -0.62953 )
							if( rsi1 <= 36.431 )
								if( smoothK_k <= 88.82 )
									ret := 0.114286
								if( smoothK_k > 88.82 )
									ret := -0.400000
							if( rsi1 > 36.431 )
								if( Typical_Price <= 73.9187 )
									ret := -0.058140
								if( Typical_Price > 73.9187 )
									ret := 0.460017
						if( d_k > -0.62953 )
							if( Positive_Money_Flow_Sum <= 406034 )
								if( Positive_Money_Flow_Sum <= 378719 )
									ret := 0.209756
								if( Positive_Money_Flow_Sum > 378719 )
									ret := 0.933333 // buy
							if( Positive_Money_Flow_Sum > 406034 )
								if( d <= 84.8162 )
									ret := -0.447368
								if( d > 84.8162 )
									ret := 0.091954
					if( d_k > 0.735787 )
						if( d_k <= 3.928 )
							if( Negative_Money_Flow_Sum <= 480404 )
								if( Negative_Money_Flow_Sum <= 368671 )
									ret := -0.059259
								if( Negative_Money_Flow_Sum > 368671 )
									ret := 0.282051
							if( Negative_Money_Flow_Sum > 480404 )
								if( Positive_Money_Flow_Sum <= 1.41909e+06 )
									ret := -0.298795
								if( Positive_Money_Flow_Sum > 1.41909e+06 )
									ret := 0.090909
						if( d_k > 3.928 )
							if( Typical_Price <= 96.5784 )
								if( MFI_Low <= 29.4738 )
									ret := -0.359223
								if( MFI_Low > 29.4738 )
									ret := 0.022346
							if( Typical_Price > 96.5784 )
								if( d <= 91.2559 )
									ret := -0.552339
								if( d > 91.2559 )
									ret := -0.290541
				if( rsi1 > 57.9347 )
					if( rsi1 <= 72.9768 )
						if( Typical_Price <= 100.297 )
							if( smoothK_k <= 83.1727 )
								if( smoothD_d <= 85.1767 )
									ret := 0.306667
								if( smoothD_d > 85.1767 )
									ret := -0.365385
							if( smoothK_k > 83.1727 )
								if( d <= 90.9155 )
									ret := 0.568000
								if( d > 90.9155 )
									ret := 0.262712
						if( Typical_Price > 100.297 )
							if( Money_Flow_Ratio <= 4.31743 )
								if( d_k <= 2.19673 )
									ret := 0.628114
								if( d_k > 2.19673 )
									ret := 0.174180
							if( Money_Flow_Ratio > 4.31743 )
								if( Raw_Money_Flow <= 60882.8 )
									ret := 0.156250
								if( Raw_Money_Flow > 60882.8 )
									ret := -0.382353
					if( rsi1 > 72.9768 )
						if( d_k <= 8.48972 )
							if( smoothK_k <= 78.0979 )
								if( MFI_Low <= 43.2652 )
									ret := 0.500000
								if( MFI_Low > 43.2652 )
									ret := 0.789855 // buy
							if( smoothK_k > 78.0979 )
								if( smoothD_d <= 95.7833 )
									ret := 0.636175
								if( smoothD_d > 95.7833 )
									ret := 0.328244
						if( d_k > 8.48972 )
							if( Negative_Money_Flow <= 113167 )
								if( MFI_Low <= 61.1474 )
									ret := 0.166667
								if( MFI_Low > 61.1474 )
									ret := -0.272727
							if( Negative_Money_Flow > 113167 )
								ret := -0.857143 // sell
	
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
float op_operation = decision_tree_0_AAVEUSDT_5Min_d6747a08(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


