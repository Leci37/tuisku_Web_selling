//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: TRXUSDT_1Min_2MS0_43ee9030 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Min_2MS0_43ee9030", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Min_43ee9030(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 0.40333 )
		if( d_k <= 4.40772 )
			if( rsi1 <= 44.5141 )
				if( Positive_Money_Flow <= 63.5878 )
					if( Negative_Money_Flow_Sum <= 52120.5 )
						if( MFI <= 12.2044 )
							if( Negative_Money_Flow_Sum <= 50011.6 )
								if( Typical_Price <= 0.148436 )
									ret := -0.359551
								if( Typical_Price > 0.148436 )
									ret := 0.041667
							if( Negative_Money_Flow_Sum > 50011.6 )
								if( d_k <= -0.637331 )
									ret := 0.166667
								if( d_k > -0.637331 )
									ret := 1.000000 // buy
						if( MFI > 12.2044 )
							if( Typical_Price <= 0.12433 )
								if( Negative_Money_Flow_Sum <= 34006 )
									ret := -0.219780
								if( Negative_Money_Flow_Sum > 34006 )
									ret := 0.129412
							if( Typical_Price > 0.12433 )
								if( MFI <= 54.933 )
									ret := 0.366348
								if( MFI > 54.933 )
									ret := 0.663522
					if( Negative_Money_Flow_Sum > 52120.5 )
						if( Negative_Money_Flow_Sum <= 424031 )
							if( d_k <= -5.65415 )
								if( Positive_Money_Flow_Sum <= 52714.9 )
									ret := -0.117363
								if( Positive_Money_Flow_Sum > 52714.9 )
									ret := 0.079787
							if( d_k > -5.65415 )
								if( MFI_High <= -18.6719 )
									ret := 0.129464
								if( MFI_High > -18.6719 )
									ret := 0.408377
						if( Negative_Money_Flow_Sum > 424031 )
							if( Raw_Money_Flow <= 58312.2 )
								if( d_k <= -2.2005 )
									ret := -0.171053
								if( d_k > -2.2005 )
									ret := 0.131466
							if( Raw_Money_Flow > 58312.2 )
								if( Negative_Money_Flow_Sum <= 468864 )
									ret := -0.720930 // sell
								if( Negative_Money_Flow_Sum > 468864 )
									ret := -0.209877
				if( Positive_Money_Flow > 63.5878 )
					if( Typical_Price <= 0.138487 )
						if( rsi1 <= 32.4299 )
							if( Positive_Money_Flow_Sum <= 476609 )
								if( Raw_Money_Flow <= 251290 )
									ret := 0.130603
								if( Raw_Money_Flow > 251290 )
									ret := -0.916667 // sell
							if( Positive_Money_Flow_Sum > 476609 )
								if( k <= 46.2061 )
									ret := -0.071429
								if( k > 46.2061 )
									ret := -0.492958
						if( rsi1 > 32.4299 )
							if( Positive_Money_Flow <= 49663.9 )
								if( MFI_High <= -62.1485 )
									ret := -0.144482
								if( MFI_High > -62.1485 )
									ret := 0.006551
							if( Positive_Money_Flow > 49663.9 )
								if( Money_Flow_Ratio <= 0.676086 )
									ret := -0.264706
								if( Money_Flow_Ratio > 0.676086 )
									ret := -0.011173
					if( Typical_Price > 0.138487 )
						if( MFI_Low <= -6.42863 )
							if( Positive_Money_Flow <= 167528 )
								if( smoothK_k <= 8.65675 )
									ret := -0.160000
								if( smoothK_k > 8.65675 )
									ret := -0.426802
							if( Positive_Money_Flow > 167528 )
								if( rsi1 <= 31.1741 )
									ret := 0.576923
								if( rsi1 > 31.1741 )
									ret := -0.500000
						if( MFI_Low > -6.42863 )
							if( MFI_High <= -38.1085 )
								if( Positive_Money_Flow_Sum <= 1.57991e+06 )
									ret := -0.147945
								if( Positive_Money_Flow_Sum > 1.57991e+06 )
									ret := 0.371134
							if( MFI_High > -38.1085 )
								if( Positive_Money_Flow_Sum <= 1.2397e+06 )
									ret := 0.050595
								if( Positive_Money_Flow_Sum > 1.2397e+06 )
									ret := 0.575758
			if( rsi1 > 44.5141 )
				if( Raw_Money_Flow <= 31581.3 )
					if( Typical_Price <= 0.124657 )
						if( Negative_Money_Flow_Sum <= 673513 )
							if( Typical_Price <= 0.117554 )
								if( Negative_Money_Flow_Sum <= 282539 )
									ret := -0.033931
								if( Negative_Money_Flow_Sum > 282539 )
									ret := 0.153846
							if( Typical_Price > 0.117554 )
								if( Positive_Money_Flow_Sum <= 190962 )
									ret := -0.083376
								if( Positive_Money_Flow_Sum > 190962 )
									ret := -0.188406
						if( Negative_Money_Flow_Sum > 673513 )
							if( Positive_Money_Flow_Sum <= 246994 )
								ret := -0.333333
							if( Positive_Money_Flow_Sum > 246994 )
								if( d_k <= -3.03495 )
									ret := 0.894737 // buy
								if( d_k > -3.03495 )
									ret := 0.454545
					if( Typical_Price > 0.124657 )
						if( rsi1 <= 50.0009 )
							if( Money_Flow_Ratio <= 0.783032 )
								if( Money_Flow_Ratio <= 0.397263 )
									ret := -0.335734
								if( Money_Flow_Ratio > 0.397263 )
									ret := -0.203981
							if( Money_Flow_Ratio > 0.783032 )
								if( Positive_Money_Flow <= 553.485 )
									ret := 0.068282
								if( Positive_Money_Flow > 553.485 )
									ret := -0.167819
						if( rsi1 > 50.0009 )
							if( Typical_Price <= 0.135556 )
								if( Positive_Money_Flow_Sum <= 26218 )
									ret := -0.514995
								if( Positive_Money_Flow_Sum > 26218 )
									ret := -0.191724
							if( Typical_Price > 0.135556 )
								if( d <= 83.3027 )
									ret := -0.360434
								if( d > 83.3027 )
									ret := -0.250090
				if( Raw_Money_Flow > 31581.3 )
					if( Positive_Money_Flow_Sum <= 237301 )
						if( rsi1 <= 50.4715 )
							if( Money_Flow_Ratio <= 0.491903 )
								if( Raw_Money_Flow <= 71162.1 )
									ret := -0.141892
								if( Raw_Money_Flow > 71162.1 )
									ret := -0.484076
							if( Money_Flow_Ratio > 0.491903 )
								if( Positive_Money_Flow <= 1350.1 )
									ret := 0.247967
								if( Positive_Money_Flow > 1350.1 )
									ret := -0.046903
						if( rsi1 > 50.4715 )
							if( Typical_Price <= 0.154998 )
								if( Negative_Money_Flow_Sum <= 56188.9 )
									ret := -0.153303
								if( Negative_Money_Flow_Sum > 56188.9 )
									ret := -0.287141
							if( Typical_Price > 0.154998 )
								if( Positive_Money_Flow <= 60363.7 )
									ret := 0.049573
								if( Positive_Money_Flow > 60363.7 )
									ret := -0.195035
					if( Positive_Money_Flow_Sum > 237301 )
						if( MFI_Low <= 29.0502 )
							if( Positive_Money_Flow_Sum <= 2.25047e+06 )
								if( Positive_Money_Flow_Sum <= 1.66833e+06 )
									ret := -0.210933
								if( Positive_Money_Flow_Sum > 1.66833e+06 )
									ret := 0.510638
							if( Positive_Money_Flow_Sum > 2.25047e+06 )
								ret := -1.000000 // sell
						if( MFI_Low > 29.0502 )
							if( Positive_Money_Flow <= 830661 )
								if( Negative_Money_Flow_Sum <= 552942 )
									ret := -0.033362
								if( Negative_Money_Flow_Sum > 552942 )
									ret := 0.169151
							if( Positive_Money_Flow > 830661 )
								if( MFI <= 66.9073 )
									ret := 0.875000 // buy
								if( MFI > 66.9073 )
									ret := -0.632653
		if( d_k > 4.40772 )
			if( rsi1 <= 47.7868 )
				if( Positive_Money_Flow <= 82.4628 )
					if( Typical_Price <= 0.12483 )
						if( Negative_Money_Flow_Sum <= 273712 )
							if( Typical_Price <= 0.120066 )
								if( Positive_Money_Flow_Sum <= 189846 )
									ret := 0.042135
								if( Positive_Money_Flow_Sum > 189846 )
									ret := -0.437500
							if( Typical_Price > 0.120066 )
								if( Typical_Price <= 0.124138 )
									ret := 0.242424
								if( Typical_Price > 0.124138 )
									ret := -0.047059
						if( Negative_Money_Flow_Sum > 273712 )
							if( MFI_High <= -31.9615 )
								if( rsi1 <= 41.4286 )
									ret := -0.381818
								if( rsi1 > 41.4286 )
									ret := 0.250000
							if( MFI_High > -31.9615 )
								if( MFI_High <= -28.3452 )
									ret := 1.000000 // buy
								if( MFI_High > -28.3452 )
									ret := 0.000000
					if( Typical_Price > 0.12483 )
						if( Money_Flow_Ratio <= 0.982888 )
							if( Negative_Money_Flow_Sum <= 41221.1 )
								if( d <= 12.4228 )
									ret := 0.242857
								if( d > 12.4228 )
									ret := 0.626966
							if( Negative_Money_Flow_Sum > 41221.1 )
								if( rsi1 <= 42.8362 )
									ret := 0.345010
								if( rsi1 > 42.8362 )
									ret := 0.149837
						if( Money_Flow_Ratio > 0.982888 )
							if( Typical_Price <= 0.1579 )
								if( Negative_Money_Flow_Sum <= 34158.6 )
									ret := 0.740672 // buy
								if( Negative_Money_Flow_Sum > 34158.6 )
									ret := 0.533007
							if( Typical_Price > 0.1579 )
								if( Raw_Money_Flow <= 51407.8 )
									ret := 0.191919
								if( Raw_Money_Flow > 51407.8 )
									ret := -0.666667
				if( Positive_Money_Flow > 82.4628 )
					if( Money_Flow_Ratio <= 2.22206 )
						if( rsi1 <= 38.2764 )
							if( Positive_Money_Flow_Sum <= 97073.9 )
								if( Positive_Money_Flow <= 26782.3 )
									ret := 0.130326
								if( Positive_Money_Flow > 26782.3 )
									ret := 0.481481
							if( Positive_Money_Flow_Sum > 97073.9 )
								if( Money_Flow_Ratio <= 0.155667 )
									ret := 0.680000
								if( Money_Flow_Ratio > 0.155667 )
									ret := -0.017804
						if( rsi1 > 38.2764 )
							if( Money_Flow_Ratio <= 0.279512 )
								if( Positive_Money_Flow_Sum <= 26962.7 )
									ret := -0.503876
								if( Positive_Money_Flow_Sum > 26962.7 )
									ret := -0.217899
							if( Money_Flow_Ratio > 0.279512 )
								if( Raw_Money_Flow <= 31932.4 )
									ret := -0.066730
								if( Raw_Money_Flow > 31932.4 )
									ret := 0.101673
					if( Money_Flow_Ratio > 2.22206 )
						if( Typical_Price <= 0.152147 )
							if( Raw_Money_Flow <= 61041.1 )
								if( Positive_Money_Flow <= 2839.45 )
									ret := 0.900000 // buy
								if( Positive_Money_Flow > 2839.45 )
									ret := 0.223684
							if( Raw_Money_Flow > 61041.1 )
								if( MFI <= 82.3027 )
									ret := 0.891304 // buy
								if( MFI > 82.3027 )
									ret := 0.545455
						if( Typical_Price > 0.152147 )
							if( d_k <= 6.32098 )
								ret := 0.750000 // buy
							if( d_k > 6.32098 )
								if( Typical_Price <= 0.15335 )
									ret := -0.800000 // sell
								if( Typical_Price > 0.15335 )
									ret := 0.076923
			if( rsi1 > 47.7868 )
				if( Positive_Money_Flow <= 0.638714 )
					if( MFI_Low <= 28.1142 )
						if( MFI <= 26.9148 )
							if( Negative_Money_Flow_Sum <= 49150.6 )
								if( rsi1 <= 49.9676 )
									ret := 1.000000 // buy
								if( rsi1 > 49.9676 )
									ret := 0.048780
							if( Negative_Money_Flow_Sum > 49150.6 )
								if( smoothK_k <= 67.1479 )
									ret := -0.299435
								if( smoothK_k > 67.1479 )
									ret := 0.076923
						if( MFI > 26.9148 )
							if( rsi1 <= 49.9966 )
								if( Typical_Price <= 0.155705 )
									ret := 0.437037
								if( Typical_Price > 0.155705 )
									ret := -0.600000
							if( rsi1 > 49.9966 )
								if( Positive_Money_Flow_Sum <= 9732.78 )
									ret := -0.346939
								if( Positive_Money_Flow_Sum > 9732.78 )
									ret := -0.041475
					if( MFI_Low > 28.1142 )
						if( d_k <= 11.583 )
							if( Raw_Money_Flow <= 87434.7 )
								if( rsi1 <= 57.1286 )
									ret := 0.126641
								if( rsi1 > 57.1286 )
									ret := -0.083142
							if( Raw_Money_Flow > 87434.7 )
								if( Positive_Money_Flow_Sum <= 2.80206e+06 )
									ret := 0.467742
								if( Positive_Money_Flow_Sum > 2.80206e+06 )
									ret := -0.692308
						if( d_k > 11.583 )
							if( rsi1 <= 56.9692 )
								if( MFI <= 72.2481 )
									ret := 0.150820
								if( MFI > 72.2481 )
									ret := 0.401628
							if( rsi1 > 56.9692 )
								if( Typical_Price <= 0.149457 )
									ret := 0.104730
								if( Typical_Price > 0.149457 )
									ret := -0.176768
				if( Positive_Money_Flow > 0.638714 )
					if( Typical_Price <= 0.130227 )
						if( Raw_Money_Flow <= 3765.26 )
							if( Typical_Price <= 0.123457 )
								if( Positive_Money_Flow_Sum <= 87493 )
									ret := 0.017621
								if( Positive_Money_Flow_Sum > 87493 )
									ret := -0.167421
							if( Typical_Price > 0.123457 )
								if( Positive_Money_Flow_Sum <= 28331 )
									ret := -0.513761
								if( Positive_Money_Flow_Sum > 28331 )
									ret := -0.254505
						if( Raw_Money_Flow > 3765.26 )
							if( Positive_Money_Flow <= 52558 )
								if( Raw_Money_Flow <= 35888.4 )
									ret := -0.043773
								if( Raw_Money_Flow > 35888.4 )
									ret := -0.193206
							if( Positive_Money_Flow > 52558 )
								if( Negative_Money_Flow_Sum <= 26821.1 )
									ret := 0.474227
								if( Negative_Money_Flow_Sum > 26821.1 )
									ret := 0.019817
					if( Typical_Price > 0.130227 )
						if( Positive_Money_Flow_Sum <= 200147 )
							if( Positive_Money_Flow <= 2019.2 )
								if( d_k <= 16.3684 )
									ret := -0.541997
								if( d_k > 16.3684 )
									ret := -0.192308
							if( Positive_Money_Flow > 2019.2 )
								if( Positive_Money_Flow <= 48453.5 )
									ret := -0.260742
								if( Positive_Money_Flow > 48453.5 )
									ret := -0.050000
						if( Positive_Money_Flow_Sum > 200147 )
							if( Raw_Money_Flow <= 45240.3 )
								if( MFI_High <= 9.38311 )
									ret := -0.186328
								if( MFI_High > 9.38311 )
									ret := -0.486667
							if( Raw_Money_Flow > 45240.3 )
								if( Positive_Money_Flow_Sum <= 3.00059e+06 )
									ret := 0.079778
								if( Positive_Money_Flow_Sum > 3.00059e+06 )
									ret := -0.416667
	if( Negative_Money_Flow > 0.40333 )
		if( Typical_Price <= 0.126329 )
			if( Negative_Money_Flow <= 750.165 )
				if( rsi1 <= 46.0133 )
					if( Raw_Money_Flow <= 772.776 )
						if( Money_Flow_Ratio <= 1.14426 )
							if( Negative_Money_Flow_Sum <= 227170 )
								if( rsi1 <= 43.3036 )
									ret := 0.000000
								if( rsi1 > 43.3036 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 227170 )
								if( Negative_Money_Flow_Sum <= 281482 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 281482 )
									ret := 0.250000
						if( Money_Flow_Ratio > 1.14426 )
							ret := 0.666667
					if( Raw_Money_Flow > 772.776 )
						if( d <= 4.17509 )
							if( Raw_Money_Flow <= 6118 )
								ret := 0.500000
							if( Raw_Money_Flow > 6118 )
								ret := -0.666667
						if( d > 4.17509 )
							if( Positive_Money_Flow_Sum <= 405094 )
								if( k <= 39.6946 )
									ret := 0.629630
								if( k > 39.6946 )
									ret := 0.917808 // buy
							if( Positive_Money_Flow_Sum > 405094 )
								ret := -0.200000
				if( rsi1 > 46.0133 )
					if( Money_Flow_Ratio <= 0.373996 )
						if( smoothD_d <= 37.1654 )
							ret := -1.000000 // sell
						if( smoothD_d > 37.1654 )
							ret := 0.000000
					if( Money_Flow_Ratio > 0.373996 )
						if( Negative_Money_Flow_Sum <= 252410 )
							if( Positive_Money_Flow <= 514.057 )
								if( smoothK_k <= 89.9001 )
									ret := 0.269036
								if( smoothK_k > 89.9001 )
									ret := -0.590909
							if( Positive_Money_Flow > 514.057 )
								if( Typical_Price <= 0.121776 )
									ret := 0.263158
								if( Typical_Price > 0.121776 )
									ret := 0.811321 // buy
						if( Negative_Money_Flow_Sum > 252410 )
							if( Positive_Money_Flow <= 11244 )
								if( Positive_Money_Flow <= 304.962 )
									ret := 0.500000
								if( Positive_Money_Flow > 304.962 )
									ret := -0.777778 // sell
							if( Positive_Money_Flow > 11244 )
								ret := 0.666667
			if( Negative_Money_Flow > 750.165 )
				if( Positive_Money_Flow_Sum <= 420518 )
					if( rsi1 <= 57.2203 )
						if( rsi1 <= 25.1085 )
							if( smoothD_d <= 15.4935 )
								if( Negative_Money_Flow <= 123948 )
									ret := 0.082569
								if( Negative_Money_Flow > 123948 )
									ret := -0.158696
							if( smoothD_d > 15.4935 )
								if( Positive_Money_Flow_Sum <= 342579 )
									ret := -0.140661
								if( Positive_Money_Flow_Sum > 342579 )
									ret := 0.640000
						if( rsi1 > 25.1085 )
							if( MFI <= 77.4789 )
								if( Typical_Price <= 0.122365 )
									ret := 0.067326
								if( Typical_Price > 0.122365 )
									ret := 0.147008
							if( MFI > 77.4789 )
								if( Negative_Money_Flow <= 5573.1 )
									ret := 0.509506
								if( Negative_Money_Flow > 5573.1 )
									ret := 0.199074
					if( rsi1 > 57.2203 )
						if( Positive_Money_Flow_Sum <= 377410 )
							if( Money_Flow_Ratio <= 1.90421 )
								if( Positive_Money_Flow_Sum <= 210406 )
									ret := -0.040055
								if( Positive_Money_Flow_Sum > 210406 )
									ret := 0.194149
							if( Money_Flow_Ratio > 1.90421 )
								if( MFI_Low <= 67.3489 )
									ret := -0.097426
								if( MFI_Low > 67.3489 )
									ret := 0.080000
						if( Positive_Money_Flow_Sum > 377410 )
							if( Negative_Money_Flow_Sum <= 244352 )
								if( Negative_Money_Flow_Sum <= 230995 )
									ret := -0.338384
								if( Negative_Money_Flow_Sum > 230995 )
									ret := -0.923077 // sell
							if( Negative_Money_Flow_Sum > 244352 )
								if( Negative_Money_Flow <= 21734.8 )
									ret := -0.272727
								if( Negative_Money_Flow > 21734.8 )
									ret := 0.619048
				if( Positive_Money_Flow_Sum > 420518 )
					if( Positive_Money_Flow_Sum <= 2.27686e+06 )
						if( Positive_Money_Flow_Sum <= 1.87223e+06 )
							if( d_k <= -0.20766 )
								if( Positive_Money_Flow_Sum <= 1.68521e+06 )
									ret := 0.146067
								if( Positive_Money_Flow_Sum > 1.68521e+06 )
									ret := -0.869565 // sell
							if( d_k > -0.20766 )
								if( d_k <= 22.2993 )
									ret := 0.286260
								if( d_k > 22.2993 )
									ret := -0.134146
						if( Positive_Money_Flow_Sum > 1.87223e+06 )
							if( Negative_Money_Flow_Sum <= 528128 )
								ret := 0.200000
							if( Negative_Money_Flow_Sum > 528128 )
								if( rsi1 <= 31.5585 )
									ret := 0.750000 // buy
								if( rsi1 > 31.5585 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 2.27686e+06 )
						if( k <= 85.3448 )
							if( rsi1 <= 71.1914 )
								ret := -1.000000 // sell
							if( rsi1 > 71.1914 )
								ret := -0.750000 // sell
						if( k > 85.3448 )
							if( Negative_Money_Flow <= 64574.4 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 64574.4 )
								if( Typical_Price <= 0.118073 )
									ret := -0.500000
								if( Typical_Price > 0.118073 )
									ret := 0.846154 // buy
		if( Typical_Price > 0.126329 )
			if( Raw_Money_Flow <= 24165.7 )
				if( Typical_Price <= 0.138484 )
					if( rsi1 <= 53.8185 )
						if( Raw_Money_Flow <= 5491.54 )
							if( MFI_Low <= 54.9789 )
								if( smoothD_d <= 11.4482 )
									ret := 0.286592
								if( smoothD_d > 11.4482 )
									ret := 0.506482
							if( MFI_Low > 54.9789 )
								if( rsi1 <= 49.8562 )
									ret := 0.876607 // buy
								if( rsi1 > 49.8562 )
									ret := 0.704508 // buy
						if( Raw_Money_Flow > 5491.54 )
							if( Negative_Money_Flow_Sum <= 37005.3 )
								if( Negative_Money_Flow <= 12235.8 )
									ret := 0.658098
								if( Negative_Money_Flow > 12235.8 )
									ret := 0.380488
							if( Negative_Money_Flow_Sum > 37005.3 )
								if( MFI_High <= -15.1521 )
									ret := 0.261841
								if( MFI_High > -15.1521 )
									ret := 0.498266
					if( rsi1 > 53.8185 )
						if( MFI_Low <= 54.824 )
							if( Positive_Money_Flow_Sum <= 428092 )
								if( Negative_Money_Flow_Sum <= 29188.5 )
									ret := 0.309735
								if( Negative_Money_Flow_Sum > 29188.5 )
									ret := -0.020108
							if( Positive_Money_Flow_Sum > 428092 )
								if( d <= 26.7237 )
									ret := -0.400000
								if( d > 26.7237 )
									ret := 0.463415
						if( MFI_Low > 54.824 )
							if( rsi1 <= 65.6535 )
								if( Negative_Money_Flow_Sum <= 20530 )
									ret := 0.712996 // buy
								if( Negative_Money_Flow_Sum > 20530 )
									ret := 0.257962
							if( rsi1 > 65.6535 )
								if( MFI <= 94.733 )
									ret := -0.088803
								if( MFI > 94.733 )
									ret := 0.375000
				if( Typical_Price > 0.138484 )
					if( Positive_Money_Flow <= 29.2759 )
						if( Typical_Price <= 0.158648 )
							if( rsi1 <= 55.5541 )
								if( Negative_Money_Flow_Sum <= 75507 )
									ret := 0.654571
								if( Negative_Money_Flow_Sum > 75507 )
									ret := 0.526351
							if( rsi1 > 55.5541 )
								if( Money_Flow_Ratio <= 3.76873 )
									ret := 0.225511
								if( Money_Flow_Ratio > 3.76873 )
									ret := 0.448837
						if( Typical_Price > 0.158648 )
							if( Typical_Price <= 0.165349 )
								if( Positive_Money_Flow_Sum <= 656174 )
									ret := 0.351365
								if( Positive_Money_Flow_Sum > 656174 )
									ret := -0.121739
							if( Typical_Price > 0.165349 )
								if( MFI <= 19.2117 )
									ret := 0.750000 // buy
								if( MFI > 19.2117 )
									ret := -0.388889
					if( Positive_Money_Flow > 29.2759 )
						if( rsi1 <= 44.6696 )
							if( Positive_Money_Flow_Sum <= 412807 )
								if( Money_Flow_Ratio <= 0.578137 )
									ret := 0.268421
								if( Money_Flow_Ratio > 0.578137 )
									ret := 0.704545 // buy
							if( Positive_Money_Flow_Sum > 412807 )
								if( Positive_Money_Flow_Sum <= 489611 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 489611 )
									ret := 0.050000
						if( rsi1 > 44.6696 )
							if( smoothD_d <= 46.8365 )
								if( d_k <= 0.117889 )
									ret := -0.351955
								if( d_k > 0.117889 )
									ret := -0.011628
							if( smoothD_d > 46.8365 )
								if( MFI_High <= 13.0467 )
									ret := 0.172174
								if( MFI_High > 13.0467 )
									ret := -0.440000
			if( Raw_Money_Flow > 24165.7 )
				if( Negative_Money_Flow_Sum <= 494819 )
					if( d_k <= 0.851801 )
						if( rsi1 <= 57.0822 )
							if( Positive_Money_Flow_Sum <= 381706 )
								if( Negative_Money_Flow_Sum <= 46377.1 )
									ret := 0.612903
								if( Negative_Money_Flow_Sum > 46377.1 )
									ret := 0.154643
							if( Positive_Money_Flow_Sum > 381706 )
								if( MFI <= 72.4327 )
									ret := 0.531088
								if( MFI > 72.4327 )
									ret := 0.072072
						if( rsi1 > 57.0822 )
							if( Raw_Money_Flow <= 40721.2 )
								if( smoothD_d <= 74.747 )
									ret := -0.325203
								if( smoothD_d > 74.747 )
									ret := -0.038647
							if( Raw_Money_Flow > 40721.2 )
								if( Positive_Money_Flow_Sum <= 192086 )
									ret := -0.241860
								if( Positive_Money_Flow_Sum > 192086 )
									ret := 0.161372
					if( d_k > 0.851801 )
						if( rsi1 <= 49.9997 )
							if( Typical_Price <= 0.140885 )
								if( Money_Flow_Ratio <= 2.14979 )
									ret := 0.222191
								if( Money_Flow_Ratio > 2.14979 )
									ret := 0.736842 // buy
							if( Typical_Price > 0.140885 )
								if( MFI_Low <= 4.17054 )
									ret := 0.296296
								if( MFI_Low > 4.17054 )
									ret := 0.440908
						if( rsi1 > 49.9997 )
							if( MFI_Low <= 45.3771 )
								if( Raw_Money_Flow <= 184686 )
									ret := 0.059094
								if( Raw_Money_Flow > 184686 )
									ret := 0.538462
							if( MFI_Low > 45.3771 )
								if( rsi1 <= 60.4592 )
									ret := 0.357669
								if( rsi1 > 60.4592 )
									ret := 0.081164
				if( Negative_Money_Flow_Sum > 494819 )
					if( Money_Flow_Ratio <= 1.28625 )
						if( Raw_Money_Flow <= 60896.7 )
							if( k <= 40.426 )
								if( Typical_Price <= 0.160214 )
									ret := 0.392681
								if( Typical_Price > 0.160214 )
									ret := -0.111111
							if( k > 40.426 )
								if( Negative_Money_Flow_Sum <= 1.71169e+06 )
									ret := -0.000995
								if( Negative_Money_Flow_Sum > 1.71169e+06 )
									ret := 0.321918
						if( Raw_Money_Flow > 60896.7 )
							if( Raw_Money_Flow <= 511129 )
								if( Positive_Money_Flow_Sum <= 793877 )
									ret := 0.023089
								if( Positive_Money_Flow_Sum > 793877 )
									ret := -0.184575
							if( Raw_Money_Flow > 511129 )
								if( Raw_Money_Flow <= 1.38348e+06 )
									ret := 0.200000
								if( Raw_Money_Flow > 1.38348e+06 )
									ret := 0.758621 // buy
					if( Money_Flow_Ratio > 1.28625 )
						if( smoothK_k <= 79.2709 )
							if( Negative_Money_Flow_Sum <= 623284 )
								if( Negative_Money_Flow <= 261365 )
									ret := -0.048193
								if( Negative_Money_Flow > 261365 )
									ret := 0.757576 // buy
							if( Negative_Money_Flow_Sum > 623284 )
								if( Raw_Money_Flow <= 518952 )
									ret := 0.426861
								if( Raw_Money_Flow > 518952 )
									ret := -0.173913
						if( smoothK_k > 79.2709 )
							if( Positive_Money_Flow_Sum <= 3.73324e+06 )
								if( Typical_Price <= 0.152457 )
									ret := 0.342105
								if( Typical_Price > 0.152457 )
									ret := -0.274510
							if( Positive_Money_Flow_Sum > 3.73324e+06 )
								if( MFI_High <= -13.1831 )
									ret := 0.600000
								if( MFI_High > -13.1831 )
									ret := -0.800000 // sell
	
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
float op_operation = decision_tree_0_TRXUSDT_1Min_43ee9030(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


