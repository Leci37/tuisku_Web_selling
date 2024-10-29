//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: SHIBUSDT_15Min_2MS0_45b19906 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHIBUSDT_15Min_2MS0_45b19906", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHIBUSDT_15Min_45b19906(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 46.4408 )
		if( Positive_Money_Flow <= 283.06 )
			if( smoothK_k <= 19.6683 )
				if( rsi1 <= 43.2073 )
					if( Money_Flow_Ratio <= 0.616811 )
						if( Negative_Money_Flow_Sum <= 4.64343e+06 )
							if( rsi1 <= 24.9998 )
								if( Positive_Money_Flow_Sum <= 708381 )
									ret := -0.396396
								if( Positive_Money_Flow_Sum > 708381 )
									ret := -0.657841
							if( rsi1 > 24.9998 )
								if( rsi1 <= 36.0901 )
									ret := -0.304373
								if( rsi1 > 36.0901 )
									ret := -0.082192
						if( Negative_Money_Flow_Sum > 4.64343e+06 )
							if( smoothD_d <= 13.8055 )
								if( Typical_Price <= 2.2e-05 )
									ret := -0.122917
								if( Typical_Price > 2.2e-05 )
									ret := -0.616352
							if( smoothD_d > 13.8055 )
								if( Negative_Money_Flow <= 504666 )
									ret := -0.281690
								if( Negative_Money_Flow > 504666 )
									ret := 0.155985
					if( Money_Flow_Ratio > 0.616811 )
						if( Money_Flow_Ratio <= 1.04368 )
							if( d_k <= 1.04957 )
								if( smoothK_k <= 19.0131 )
									ret := -0.514236
								if( smoothK_k > 19.0131 )
									ret := 0.041667
							if( d_k > 1.04957 )
								if( rsi1 <= 33.3171 )
									ret := -0.580994
								if( rsi1 > 33.3171 )
									ret := -0.178656
						if( Money_Flow_Ratio > 1.04368 )
							if( Raw_Money_Flow <= 58814.7 )
								if( Typical_Price <= 8e-06 )
									ret := -0.022989
								if( Typical_Price > 8e-06 )
									ret := -0.219178
							if( Raw_Money_Flow > 58814.7 )
								if( smoothK_k <= -2.97966 )
									ret := -0.420613
								if( smoothK_k > -2.97966 )
									ret := -0.630454
				if( rsi1 > 43.2073 )
					if( rsi1 <= 58.7672 )
						if( rsi1 <= 54.1655 )
							if( Positive_Money_Flow_Sum <= 2.80968e+06 )
								if( MFI_High <= -25.786 )
									ret := 0.024422
								if( MFI_High > -25.786 )
									ret := -0.139104
							if( Positive_Money_Flow_Sum > 2.80968e+06 )
								if( MFI <= 56.5449 )
									ret := -0.067582
								if( MFI > 56.5449 )
									ret := -0.366111
						if( rsi1 > 54.1655 )
							if( MFI_High <= -13.6192 )
								if( smoothK_k <= 11.6746 )
									ret := 0.053640
								if( smoothK_k > 11.6746 )
									ret := 0.452632
							if( MFI_High > -13.6192 )
								if( MFI_High <= -2.262 )
									ret := -0.222222
								if( MFI_High > -2.262 )
									ret := -0.691358
					if( rsi1 > 58.7672 )
						if( MFI_Low <= 59.2316 )
							if( d_k <= 2.22197 )
								if( Typical_Price <= 1e-05 )
									ret := 0.242424
								if( Typical_Price > 1e-05 )
									ret := 0.612500
							if( d_k > 2.22197 )
								if( d <= 6.77025 )
									ret := -0.466667
								if( d > 6.77025 )
									ret := 0.228324
						if( MFI_Low > 59.2316 )
							if( Negative_Money_Flow_Sum <= 6.82893e+06 )
								if( Positive_Money_Flow_Sum <= 8.45166e+06 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 8.45166e+06 )
									ret := 0.448276
							if( Negative_Money_Flow_Sum > 6.82893e+06 )
								if( Money_Flow_Ratio <= 4.32441 )
									ret := -0.454545
								if( Money_Flow_Ratio > 4.32441 )
									ret := -1.000000 // sell
			if( smoothK_k > 19.6683 )
				if( Negative_Money_Flow <= 959418 )
					if( Typical_Price <= 2e-05 )
						if( rsi1 <= 47.0523 )
							if( MFI_High <= -34.7902 )
								if( Negative_Money_Flow <= 277784 )
									ret := -0.222030
								if( Negative_Money_Flow > 277784 )
									ret := -0.018805
							if( MFI_High > -34.7902 )
								if( smoothD_d <= 49.5999 )
									ret := -0.457887
								if( smoothD_d > 49.5999 )
									ret := -0.145540
						if( rsi1 > 47.0523 )
							if( rsi1 <= 57.7165 )
								if( Money_Flow_Ratio <= 1.72186 )
									ret := 0.122587
								if( Money_Flow_Ratio > 1.72186 )
									ret := -0.241843
							if( rsi1 > 57.7165 )
								if( MFI <= 75.8299 )
									ret := 0.369589
								if( MFI > 75.8299 )
									ret := -0.164474
					if( Typical_Price > 2e-05 )
						if( smoothD_d <= 24.323 )
							if( Money_Flow_Ratio <= 0.291118 )
								ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.291118 )
								if( Positive_Money_Flow_Sum <= 2.30416e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 2.30416e+06 )
									ret := -0.422414
						if( smoothD_d > 24.323 )
							if( MFI_Low <= 10.0688 )
								if( smoothK_k <= 35.4914 )
									ret := 0.571429
								if( smoothK_k > 35.4914 )
									ret := 0.000000
							if( MFI_Low > 10.0688 )
								if( smoothK_k <= 37.3055 )
									ret := -0.404494
								if( smoothK_k > 37.3055 )
									ret := 0.009615
				if( Negative_Money_Flow > 959418 )
					if( MFI_High <= -55.829 )
						if( Typical_Price <= 2.1e-05 )
							if( Negative_Money_Flow <= 2.08983e+06 )
								if( rsi1 <= 26.365 )
									ret := -0.083969
								if( rsi1 > 26.365 )
									ret := 0.576577
							if( Negative_Money_Flow > 2.08983e+06 )
								if( Negative_Money_Flow_Sum <= 8.19537e+06 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 8.19537e+06 )
									ret := 0.780374 // buy
						if( Typical_Price > 2.1e-05 )
							if( smoothD_d <= 14.751 )
								if( Typical_Price <= 2.4e-05 )
									ret := -0.666667
								if( Typical_Price > 2.4e-05 )
									ret := -1.000000 // sell
							if( smoothD_d > 14.751 )
								if( MFI <= 23.1209 )
									ret := 0.219653
								if( MFI > 23.1209 )
									ret := 0.909091 // buy
					if( MFI_High > -55.829 )
						if( Typical_Price <= 2e-05 )
							if( d <= 25.7029 )
								if( smoothD_d <= 11.5773 )
									ret := -0.960000 // sell
								if( smoothD_d > 11.5773 )
									ret := -0.195219
							if( d > 25.7029 )
								if( Negative_Money_Flow <= 1.14511e+06 )
									ret := 0.304110
								if( Negative_Money_Flow > 1.14511e+06 )
									ret := 0.034733
						if( Typical_Price > 2e-05 )
							if( rsi1 <= 45.587 )
								if( MFI_High <= -48.9697 )
									ret := -0.006803
								if( MFI_High > -48.9697 )
									ret := -0.572519
							if( rsi1 > 45.587 )
								if( Raw_Money_Flow <= 1.87074e+07 )
									ret := 0.297078
								if( Raw_Money_Flow > 1.87074e+07 )
									ret := -0.750000 // sell
		if( Positive_Money_Flow > 283.06 )
			if( rsi1 <= 42.857 )
				if( smoothK_k <= 16.763 )
					if( Negative_Money_Flow_Sum <= 2.80475e+06 )
						if( Money_Flow_Ratio <= 0.840208 )
							if( rsi1 <= 33.3169 )
								if( rsi1 <= 21.4097 )
									ret := -0.777778 // sell
								if( rsi1 > 21.4097 )
									ret := -0.530357
							if( rsi1 > 33.3169 )
								if( rsi1 <= 33.336 )
									ret := 0.000000
								if( rsi1 > 33.336 )
									ret := -0.298701
						if( Money_Flow_Ratio > 0.840208 )
							if( d <= 39.2215 )
								if( Negative_Money_Flow_Sum <= 1.22604e+06 )
									ret := -0.619632
								if( Negative_Money_Flow_Sum > 1.22604e+06 )
									ret := -0.760870 // sell
							if( d > 39.2215 )
								if( rsi1 <= 34.8077 )
									ret := -0.333333
								if( rsi1 > 34.8077 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 2.80475e+06 )
						if( Positive_Money_Flow_Sum <= 8.33182e+06 )
							if( Typical_Price <= 1.5e-05 )
								if( Positive_Money_Flow_Sum <= 527975 )
									ret := 0.923077 // buy
								if( Positive_Money_Flow_Sum > 527975 )
									ret := -0.278578
							if( Typical_Price > 1.5e-05 )
								if( MFI <= 40.4876 )
									ret := -0.448071
								if( MFI > 40.4876 )
									ret := -0.775281 // sell
						if( Positive_Money_Flow_Sum > 8.33182e+06 )
							if( MFI_Low <= 23.6792 )
								if( Typical_Price <= 2.7e-05 )
									ret := -0.389972
								if( Typical_Price > 2.7e-05 )
									ret := -0.803922 // sell
							if( MFI_Low > 23.6792 )
								if( Negative_Money_Flow_Sum <= 6.58411e+06 )
									ret := -0.945946 // sell
								if( Negative_Money_Flow_Sum > 6.58411e+06 )
									ret := -0.773438 // sell
				if( smoothK_k > 16.763 )
					if( Money_Flow_Ratio <= 0.704315 )
						if( Typical_Price <= 2.4e-05 )
							if( MFI <= 31.5854 )
								if( Positive_Money_Flow_Sum <= 2.74255e+06 )
									ret := -0.294643
								if( Positive_Money_Flow_Sum > 2.74255e+06 )
									ret := 0.050072
							if( MFI > 31.5854 )
								if( rsi1 <= 35.4635 )
									ret := -0.479381
								if( rsi1 > 35.4635 )
									ret := -0.187361
						if( Typical_Price > 2.4e-05 )
							if( Positive_Money_Flow_Sum <= 7.93278e+06 )
								if( Positive_Money_Flow <= 389196 )
									ret := -0.769231 // sell
								if( Positive_Money_Flow > 389196 )
									ret := -0.277778
							if( Positive_Money_Flow_Sum > 7.93278e+06 )
								if( Money_Flow_Ratio <= 0.575494 )
									ret := -0.663866
								if( Money_Flow_Ratio > 0.575494 )
									ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.704315 )
						if( Raw_Money_Flow <= 2.80884e+06 )
							if( MFI_High <= -29.0557 )
								if( smoothD_d <= 22.9621 )
									ret := -0.377953
								if( smoothD_d > 22.9621 )
									ret := -0.602310
							if( MFI_High > -29.0557 )
								if( Raw_Money_Flow <= 179062 )
									ret := -0.512563
								if( Raw_Money_Flow > 179062 )
									ret := -0.790456 // sell
						if( Raw_Money_Flow > 2.80884e+06 )
							if( Typical_Price <= 3e-05 )
								if( MFI <= 44.3192 )
									ret := -0.600000
								if( MFI > 44.3192 )
									ret := -0.992537 // sell
							if( Typical_Price > 3e-05 )
								if( k <= 28.8629 )
									ret := -0.476190
								if( k > 28.8629 )
									ret := -0.894737 // sell
			if( rsi1 > 42.857 )
				if( MFI_High <= -19.9417 )
					if( rsi1 <= 57.3734 )
						if( Money_Flow_Ratio <= 0.878127 )
							if( Positive_Money_Flow_Sum <= 5.03037e+07 )
								if( d <= 21.0039 )
									ret := -0.135612
								if( d > 21.0039 )
									ret := 0.034789
							if( Positive_Money_Flow_Sum > 5.03037e+07 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.878127 )
							if( k <= 44.0138 )
								if( Negative_Money_Flow <= 2.10156e+06 )
									ret := -0.213534
								if( Negative_Money_Flow > 2.10156e+06 )
									ret := 0.875000 // buy
							if( k > 44.0138 )
								if( Positive_Money_Flow_Sum <= 2.85244e+06 )
									ret := -0.125000
								if( Positive_Money_Flow_Sum > 2.85244e+06 )
									ret := -0.555556
					if( rsi1 > 57.3734 )
						if( rsi1 <= 62.3028 )
							if( smoothD_d <= 36.1113 )
								if( Negative_Money_Flow_Sum <= 1.47898e+07 )
									ret := -0.009615
								if( Negative_Money_Flow_Sum > 1.47898e+07 )
									ret := 0.545455
							if( smoothD_d > 36.1113 )
								if( MFI_High <= -29.1903 )
									ret := 0.533333
								if( MFI_High > -29.1903 )
									ret := 0.172414
						if( rsi1 > 62.3028 )
							if( d <= 18.434 )
								ret := -0.200000
							if( d > 18.434 )
								if( Raw_Money_Flow <= 2.10947e+06 )
									ret := 0.476821
								if( Raw_Money_Flow > 2.10947e+06 )
									ret := 1.000000 // buy
				if( MFI_High > -19.9417 )
					if( rsi1 <= 55.9785 )
						if( MFI_Low <= 52.2454 )
							if( Positive_Money_Flow <= 279471 )
								if( d_k <= 8.38687 )
									ret := -0.293900
								if( d_k > 8.38687 )
									ret := -0.039683
							if( Positive_Money_Flow > 279471 )
								if( Negative_Money_Flow <= 1.94366e+06 )
									ret := -0.599856
								if( Negative_Money_Flow > 1.94366e+06 )
									ret := 0.230769
						if( MFI_Low > 52.2454 )
							if( Raw_Money_Flow <= 212000 )
								if( Raw_Money_Flow <= 83288 )
									ret := -0.074074
								if( Raw_Money_Flow > 83288 )
									ret := -0.493878
							if( Raw_Money_Flow > 212000 )
								if( Positive_Money_Flow <= 5.95365e+06 )
									ret := -0.719477 // sell
								if( Positive_Money_Flow > 5.95365e+06 )
									ret := -0.970874 // sell
					if( rsi1 > 55.9785 )
						if( Negative_Money_Flow_Sum <= 1.19968e+07 )
							if( MFI_High <= -0.036418 )
								if( rsi1 <= 67.7305 )
									ret := -0.170522
								if( rsi1 > 67.7305 )
									ret := 0.260000
							if( MFI_High > -0.036418 )
								if( Positive_Money_Flow <= 335510 )
									ret := -0.296000
								if( Positive_Money_Flow > 335510 )
									ret := -0.672199
						if( Negative_Money_Flow_Sum > 1.19968e+07 )
							if( Negative_Money_Flow_Sum <= 1.84737e+07 )
								if( MFI <= 74.2894 )
									ret := 0.532258
								if( MFI > 74.2894 )
									ret := -0.372549
							if( Negative_Money_Flow_Sum > 1.84737e+07 )
								if( k <= 23.1702 )
									ret := -0.409722
								if( k > 23.1702 )
									ret := 0.006289
	if( k > 46.4408 )
		if( k <= 68.542 )
			if( rsi1 <= 50.4676 )
				if( MFI <= 30.3747 )
					if( Negative_Money_Flow <= 297058 )
						if( rsi1 <= 38.76 )
							if( rsi1 <= 34.4817 )
								if( MFI_High <= -56.7487 )
									ret := -0.479167
								if( MFI_High > -56.7487 )
									ret := -0.094340
							if( rsi1 > 34.4817 )
								if( Negative_Money_Flow_Sum <= 9.60212e+06 )
									ret := -0.196154
								if( Negative_Money_Flow_Sum > 9.60212e+06 )
									ret := 0.244681
						if( rsi1 > 38.76 )
							if( Negative_Money_Flow_Sum <= 7.67148e+06 )
								if( Negative_Money_Flow <= 156564 )
									ret := 0.041494
								if( Negative_Money_Flow > 156564 )
									ret := 0.336898
							if( Negative_Money_Flow_Sum > 7.67148e+06 )
								if( d_k <= -11.1211 )
									ret := 0.030303
								if( d_k > -11.1211 )
									ret := 0.772358 // buy
					if( Negative_Money_Flow > 297058 )
						if( MFI_High <= -66.025 )
							if( smoothD_d <= 32.1358 )
								ret := -0.250000
							if( smoothD_d > 32.1358 )
								if( Raw_Money_Flow <= 2.3776e+06 )
									ret := 0.765766 // buy
								if( Raw_Money_Flow > 2.3776e+06 )
									ret := 0.986486 // buy
						if( MFI_High > -66.025 )
							if( d <= 30.888 )
								if( Negative_Money_Flow_Sum <= 8.68952e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 8.68952e+06 )
									ret := -0.846154 // sell
							if( d > 30.888 )
								if( d_k <= 13.4947 )
									ret := 0.453290
								if( d_k > 13.4947 )
									ret := 0.017241
				if( MFI > 30.3747 )
					if( Negative_Money_Flow <= 154491 )
						if( MFI <= 41.2117 )
							if( rsi1 <= 40.5722 )
								if( Positive_Money_Flow <= 874736 )
									ret := -0.431290
								if( Positive_Money_Flow > 874736 )
									ret := -0.124224
							if( rsi1 > 40.5722 )
								if( Raw_Money_Flow <= 476429 )
									ret := -0.123367
								if( Raw_Money_Flow > 476429 )
									ret := 0.232737
						if( MFI > 41.2117 )
							if( Positive_Money_Flow <= 427562 )
								if( rsi1 <= 42.6784 )
									ret := -0.470238
								if( rsi1 > 42.6784 )
									ret := -0.115146
							if( Positive_Money_Flow > 427562 )
								if( Positive_Money_Flow <= 494902 )
									ret := -0.772059 // sell
								if( Positive_Money_Flow > 494902 )
									ret := -0.428251
					if( Negative_Money_Flow > 154491 )
						if( Negative_Money_Flow_Sum <= 1.99826e+07 )
							if( MFI_High <= -30.9607 )
								if( rsi1 <= 44.7692 )
									ret := -0.000849
								if( rsi1 > 44.7692 )
									ret := 0.262972
							if( MFI_High > -30.9607 )
								if( k <= 51.7959 )
									ret := -0.352490
								if( k > 51.7959 )
									ret := -0.180505
						if( Negative_Money_Flow_Sum > 1.99826e+07 )
							if( Typical_Price <= 2.9e-05 )
								if( smoothD_d <= 40.9012 )
									ret := -0.763158 // sell
								if( smoothD_d > 40.9012 )
									ret := -0.017937
							if( Typical_Price > 2.9e-05 )
								if( Positive_Money_Flow_Sum <= 6.46007e+07 )
									ret := -0.923077 // sell
								if( Positive_Money_Flow_Sum > 6.46007e+07 )
									ret := -0.122449
			if( rsi1 > 50.4676 )
				if( Money_Flow_Ratio <= 1.01693 )
					if( rsi1 <= 60.4393 )
						if( Negative_Money_Flow <= 155432 )
							if( MFI <= 45.2664 )
								if( smoothD_d <= 39.0153 )
									ret := 0.046667
								if( smoothD_d > 39.0153 )
									ret := 0.466292
							if( MFI > 45.2664 )
								if( rsi1 <= 54.6309 )
									ret := 0.024561
								if( rsi1 > 54.6309 )
									ret := 0.312292
						if( Negative_Money_Flow > 155432 )
							if( MFI <= 35.8341 )
								if( smoothD_d <= 37.5505 )
									ret := 0.612903
								if( smoothD_d > 37.5505 )
									ret := 0.910714 // buy
							if( MFI > 35.8341 )
								if( Negative_Money_Flow_Sum <= 1.24905e+07 )
									ret := 0.446970
								if( Negative_Money_Flow_Sum > 1.24905e+07 )
									ret := 0.690647
					if( rsi1 > 60.4393 )
						if( Typical_Price <= 7e-06 )
							ret := 0.000000
						if( Typical_Price > 7e-06 )
							if( Positive_Money_Flow_Sum <= 1.08517e+06 )
								if( d_k <= -5.18722 )
									ret := 0.280000
								if( d_k > -5.18722 )
									ret := 0.641509
							if( Positive_Money_Flow_Sum > 1.08517e+06 )
								if( k <= 49.6518 )
									ret := 0.411765
								if( k > 49.6518 )
									ret := 0.781671 // buy
				if( Money_Flow_Ratio > 1.01693 )
					if( Negative_Money_Flow <= 114.534 )
						if( smoothD_d <= 64.1712 )
							if( MFI <= 76.0165 )
								if( rsi1 <= 63.2445 )
									ret := -0.102587
								if( rsi1 > 63.2445 )
									ret := 0.160584
							if( MFI > 76.0165 )
								if( Positive_Money_Flow_Sum <= 2.96409e+06 )
									ret := -0.053254
								if( Positive_Money_Flow_Sum > 2.96409e+06 )
									ret := -0.487479
						if( smoothD_d > 64.1712 )
							if( k <= 58.2512 )
								if( rsi1 <= 57.8071 )
									ret := 0.090226
								if( rsi1 > 57.8071 )
									ret := 0.522388
							if( k > 58.2512 )
								if( d <= 75.042 )
									ret := 0.065776
								if( d > 75.042 )
									ret := 0.372007
					if( Negative_Money_Flow > 114.534 )
						if( Typical_Price <= 2.4e-05 )
							if( Money_Flow_Ratio <= 2.18474 )
								if( Negative_Money_Flow <= 320342 )
									ret := 0.354043
								if( Negative_Money_Flow > 320342 )
									ret := 0.177139
							if( Money_Flow_Ratio > 2.18474 )
								if( rsi1 <= 72.4663 )
									ret := -0.130769
								if( rsi1 > 72.4663 )
									ret := 0.520408
						if( Typical_Price > 2.4e-05 )
							if( Raw_Money_Flow <= 819620 )
								if( Negative_Money_Flow_Sum <= 4.71298e+06 )
									ret := -0.041667
								if( Negative_Money_Flow_Sum > 4.71298e+06 )
									ret := 0.384615
							if( Raw_Money_Flow > 819620 )
								if( MFI <= 53.3666 )
									ret := 0.333333
								if( MFI > 53.3666 )
									ret := 0.720149 // buy
		if( k > 68.542 )
			if( MFI <= 56.5579 )
				if( Positive_Money_Flow <= 22753.6 )
					if( rsi1 <= 54.58 )
						if( Money_Flow_Ratio <= 0.546551 )
							if( rsi1 <= 42.3093 )
								if( Money_Flow_Ratio <= 0.200203 )
									ret := 0.523148
								if( Money_Flow_Ratio > 0.200203 )
									ret := 0.203685
							if( rsi1 > 42.3093 )
								if( Raw_Money_Flow <= 282674 )
									ret := 0.294437
								if( Raw_Money_Flow > 282674 )
									ret := 0.661810
						if( Money_Flow_Ratio > 0.546551 )
							if( Money_Flow_Ratio <= 0.869894 )
								if( Negative_Money_Flow <= 4.937e+06 )
									ret := 0.188248
								if( Negative_Money_Flow > 4.937e+06 )
									ret := 0.833333 // buy
							if( Money_Flow_Ratio > 0.869894 )
								if( rsi1 <= 48.636 )
									ret := -0.169082
								if( rsi1 > 48.636 )
									ret := 0.147014
					if( rsi1 > 54.58 )
						if( Negative_Money_Flow <= 149724 )
							if( Money_Flow_Ratio <= 1.07299 )
								if( Raw_Money_Flow <= 65829.5 )
									ret := 0.205729
								if( Raw_Money_Flow > 65829.5 )
									ret := 0.401656
							if( Money_Flow_Ratio > 1.07299 )
								if( Typical_Price <= 1e-05 )
									ret := 0.615385
								if( Typical_Price > 1e-05 )
									ret := 0.348214
						if( Negative_Money_Flow > 149724 )
							if( MFI_High <= -30.8287 )
								if( Negative_Money_Flow <= 573474 )
									ret := 0.666452
								if( Negative_Money_Flow > 573474 )
									ret := 0.788964 // buy
							if( MFI_High > -30.8287 )
								if( Typical_Price <= 1.5e-05 )
									ret := 0.501109
								if( Typical_Price > 1.5e-05 )
									ret := 0.688222
				if( Positive_Money_Flow > 22753.6 )
					if( k <= 84.9312 )
						if( d <= 48.5141 )
							if( MFI <= 32.0241 )
								if( Typical_Price <= 1e-05 )
									ret := -0.666667
								if( Typical_Price > 1e-05 )
									ret := -0.200000
							if( MFI > 32.0241 )
								if( smoothD_d <= 39.4869 )
									ret := -0.500000
								if( smoothD_d > 39.4869 )
									ret := 0.061728
						if( d > 48.5141 )
							if( Positive_Money_Flow <= 695926 )
								if( MFI_High <= -45.301 )
									ret := 0.147228
								if( MFI_High > -45.301 )
									ret := 0.275665
							if( Positive_Money_Flow > 695926 )
								if( MFI <= 37.492 )
									ret := 0.328546
								if( MFI > 37.492 )
									ret := 0.038462
					if( k > 84.9312 )
						if( Raw_Money_Flow <= 68925.4 )
							if( rsi1 <= 64.611 )
								if( Negative_Money_Flow_Sum <= 2.975e+06 )
									ret := 0.020000
								if( Negative_Money_Flow_Sum > 2.975e+06 )
									ret := -0.333333
							if( rsi1 > 64.611 )
								if( Typical_Price <= 8e-06 )
									ret := 0.519481
								if( Typical_Price > 8e-06 )
									ret := 0.245902
						if( Raw_Money_Flow > 68925.4 )
							if( MFI <= 13.3867 )
								if( rsi1 <= 35.1787 )
									ret := -0.809524 // sell
								if( rsi1 > 35.1787 )
									ret := 0.285714
							if( MFI > 13.3867 )
								if( rsi1 <= 62.2332 )
									ret := 0.277508
								if( rsi1 > 62.2332 )
									ret := 0.634982
			if( MFI > 56.5579 )
				if( rsi1 <= 69.2486 )
					if( Positive_Money_Flow_Sum <= 3.66894e+06 )
						if( MFI <= 70.0045 )
							if( d_k <= -12.0328 )
								if( Negative_Money_Flow_Sum <= 2.154e+06 )
									ret := 0.059561
								if( Negative_Money_Flow_Sum > 2.154e+06 )
									ret := -0.533333
							if( d_k > -12.0328 )
								if( Positive_Money_Flow_Sum <= 3.01001e+06 )
									ret := 0.171582
								if( Positive_Money_Flow_Sum > 3.01001e+06 )
									ret := 0.388060
						if( MFI > 70.0045 )
							if( Money_Flow_Ratio <= 2.35942 )
								if( Positive_Money_Flow <= 189833 )
									ret := 0.000000
								if( Positive_Money_Flow > 189833 )
									ret := -0.789474 // sell
							if( Money_Flow_Ratio > 2.35942 )
								if( Negative_Money_Flow_Sum <= 1.22317e+06 )
									ret := -0.001333
								if( Negative_Money_Flow_Sum > 1.22317e+06 )
									ret := 0.437500
					if( Positive_Money_Flow_Sum > 3.66894e+06 )
						if( d_k <= 6.44028 )
							if( Raw_Money_Flow <= 3.88699e+06 )
								if( Positive_Money_Flow_Sum <= 2.10514e+07 )
									ret := -0.004295
								if( Positive_Money_Flow_Sum > 2.10514e+07 )
									ret := 0.409091
							if( Raw_Money_Flow > 3.88699e+06 )
								if( Negative_Money_Flow <= 886045 )
									ret := -0.498141
								if( Negative_Money_Flow > 886045 )
									ret := 0.057971
						if( d_k > 6.44028 )
							if( rsi1 <= 64.4073 )
								if( Raw_Money_Flow <= 6.9839e+06 )
									ret := 0.232246
								if( Raw_Money_Flow > 6.9839e+06 )
									ret := -1.000000 // sell
							if( rsi1 > 64.4073 )
								if( Typical_Price <= 1e-05 )
									ret := 0.857143 // buy
								if( Typical_Price > 1e-05 )
									ret := 0.491453
				if( rsi1 > 69.2486 )
					if( MFI_High <= -13.755 )
						if( Positive_Money_Flow <= 2.1759e+06 )
							if( k <= 99.997 )
								if( rsi1 <= 75.0083 )
									ret := 0.584015
								if( rsi1 > 75.0083 )
									ret := 0.755200 // buy
							if( k > 99.997 )
								if( Positive_Money_Flow_Sum <= 1.34438e+06 )
									ret := 0.027778
								if( Positive_Money_Flow_Sum > 1.34438e+06 )
									ret := 0.595420
						if( Positive_Money_Flow > 2.1759e+06 )
							if( Money_Flow_Ratio <= 1.48042 )
								if( Positive_Money_Flow_Sum <= 2.99083e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 2.99083e+07 )
									ret := 0.937500 // buy
							if( Money_Flow_Ratio > 1.48042 )
								if( d <= 77.974 )
									ret := 0.857143 // buy
								if( d > 77.974 )
									ret := 0.975610 // buy
					if( MFI_High > -13.755 )
						if( Positive_Money_Flow_Sum <= 4.695e+06 )
							if( k <= 99.8045 )
								if( d_k <= 10.7908 )
									ret := 0.455365
								if( d_k > 10.7908 )
									ret := 0.831169 // buy
							if( k > 99.8045 )
								if( rsi1 <= 77.2078 )
									ret := -0.118421
								if( rsi1 > 77.2078 )
									ret := 0.480000
						if( Positive_Money_Flow_Sum > 4.695e+06 )
							if( MFI_High <= -4.48627 )
								if( rsi1 <= 75.9391 )
									ret := 0.142217
								if( rsi1 > 75.9391 )
									ret := 0.643357
							if( MFI_High > -4.48627 )
								if( Negative_Money_Flow_Sum <= 3.57713e+07 )
									ret := 0.127567
								if( Negative_Money_Flow_Sum > 3.57713e+07 )
									ret := -0.750000 // sell
	
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
float op_operation = decision_tree_0_SHIBUSDT_15Min_45b19906(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


